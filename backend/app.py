from flask import Flask, request, jsonify
from db import get_db_connector
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

@app.route('/')
def home():
    return "Backend running successfully"

@app.route('/test-db')
def test_db():
    try:
        conn = get_db_connector()
        conn.close()
        return jsonify ({"message": "Database connected successfully"})
    except Exception as e:
        return jsonify ({"error": str(e)}), 500
    
@app.route('/student',methods=['POST'])
def add_student():
    data = request.json
    if not data.get('name') or not data.get('age') or not data.get('Phone_number') or not data.get('DOB') or not data.get('Mother_name') or not data.get('Father_name') or not data.get('address'):
        return jsonify ({"error": "Input field missing"}), 400
    
    conn = get_db_connector()
    cursor = conn.cursor

    query = """
        INSERT INTO Student(name,age,Phone_number,DOB,Mother_name,Father_name,address)
        VALUES(%s,%s,%s,%s,%s,%s,%s)
        """
    
    cursor.execute(query,(
        data['name'],
        data['age'],
        data['Phone_number'],
        data['DOB'],
        data['Mother_name'],
        data['Father_name'],
        data['address']
    ))

    cursor.commit()
    cursor.close()
    conn.close()

    return jsonify({"message":"New query has been added"}), 201

@app.route('/student',methods=['GET'])
def get_student():
    conn = get_db_connector()
    cursor = conn.cursor

    cursor.execute("Select * From Student")
    student = cursor.fetchall()

    return jsonify(student)

if __name__ == '__main__':
    app.run(debug=True)