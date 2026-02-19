import { useState } from "react";

function StudentenFORM() {
  const [form, setForm] = useState({
    name: "",
    age: "",
    Phone_number: "",
    DOB: "",
    Mother_name: "",
    Father_name: "",
    address: ""
  });

  const handleChange = (e) => {
    setForm({
      ...form,
      [e.target.name]: e.target.value
    });
  };

  const submitForm = async () => {
    await fetch("http://127.0.0.1:5000/students", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(form)
    });

    alert("Student Enquiry Added");
  };

  return (
    <div>
      <div>
        <label>Student Name: </label>
        <input
          type="text"
          name="name"
          value={form.name}
          onChange={handleChange}
        />
      </div>
      <br />

      <div>
        <label>Student age: </label>
        <input
          type="number"
          name="age"
          value={form.age}
          onChange={handleChange}
        />
      </div>
      <br />

      <div>
        <label>Student number: </label>
        <input
          type="text"
          name="Phone_number"
          value={form.Phone_number}
          onChange={handleChange}
        />
      </div>
      <br />

      

      <div>
        <label>Student Date of Birth: </label>
        <input
            type="date"
            name="DOB"
            value={form.DOB}
            onChange={handleChange}
        />
      </div>
      <br />

      <div>
        <label>Student's Mother name: </label>
        <input
            type="text"
            name="Mother_name"
            value={form.Mother_name}
            onChange={handleChange}
        />
      </div>
      <br />

      <div>
        <label>Student's Father name: </label>
        <input
            type="text"
            name="Father_name"
            value={form.Father_name}
            onChange={handleChange}
        />
      </div>
      <br />

      <div>
        <label>Student's address: </label>
        <input
            type="text"
            name="address"
            value={form.address}
            onChange={handleChange}
        />
      </div>
      <br />
      <button onClick={submitForm}>Submit</button>
    </div>
  );
}
export default StudentenFORM;