import mysql.connector

def get_db_connector():
    return mysql.connector.connect(
        host = "localhost",
        user = "avinash",
        password = "Avinumee@3112",
        database = "Student"
    )


