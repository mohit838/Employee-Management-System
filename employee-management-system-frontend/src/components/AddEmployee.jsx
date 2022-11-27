import React, { useState } from "react";
import EmployeeService from "../services/EmployeeService";

const AddEmployee = () => {
  const [employee, setEmployee] = useState({
    id: "",
    firstName: "",
    lastName: "",
    emailId: "",
  });

  const handleOnBlur = (e) => {
    const field = e.target.name;
    const value = e.target.value;
    const newEmpData = { ...employee };
    newEmpData[field] = value;
    setEmployee(newEmpData);
  };

  const saveEmployee = (e) => {
    e.preventDefault();
    EmployeeService.saveEmployee(employee)
      .then((res) => {
        console.log(res);
      })
      .catch((error) => console.log(error));
  };

  return (
    <>
      <div className="flex max-w-2xl shadow border-b-3 mx-auto">
        <div className="px-8 py-8">
          <div className="">
            <h1 className="font-thin text-2xl tracking-wider">
              Add new employees
            </h1>
          </div>

          {/* Form */}
          <div className="flex flex-col gap-3 mt-4">
            <div className="items-center justify-center h-14 w-full my-4">
              <label className="block text-sm font-normal">First Name: </label>
              <input
                placeholder="Enter first name"
                name="firstName"
                type="text"
                onBlur={handleOnBlur}
                className="h-10 w-96 border mt-2 p-2 outline-none"
              />
            </div>

            <div className="items-center justify-center h-14 w-full my-4">
              <label className="block text-sm font-normal">Last Name: </label>
              <input
                placeholder="Enter last name"
                name="lastName"
                type="text"
                onBlur={handleOnBlur}
                className="h-10 w-96 border mt-2 p-2 outline-none"
              />
            </div>

            <div className="items-center justify-center h-14 w-full my-4">
              <label className="block text-sm font-normal">Email: </label>
              <input
                placeholder="Your email"
                name="emailId"
                type="email"
                onBlur={handleOnBlur}
                className="h-10 w-96 border mt-2 p-2 outline-none"
              />
            </div>

            {/* Button */}
            <div className="items-center justify-center h-14 w-full my-4 space-x-4">
              <button
                onClick={saveEmployee}
                className="rounded-sm font-bold text-white px-6 py-2 bg-green-600 hover:bg-green-900"
              >
                Save
              </button>
              <button className="rounded-sm font-bold text-white px-6 py-2 bg-green-600 hover:bg-green-900">
                Clear
              </button>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default AddEmployee;
