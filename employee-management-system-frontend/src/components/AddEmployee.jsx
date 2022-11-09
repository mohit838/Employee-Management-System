import React from "react";

const AddEmployee = () => {
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
                type="text"
                placeholder="Enter first name"
                className="h-10 w-96 border mt-2 p-2 outline-none"
              />
            </div>

            <div className="items-center justify-center h-14 w-full my-4">
              <label className="block text-sm font-normal">Last Name: </label>
              <input
                type="text"
                placeholder="Enter last name"
                className="h-10 w-96 border mt-2 p-2 outline-none"
              />
            </div>

            <div className="items-center justify-center h-14 w-full my-4">
              <label className="block text-sm font-normal">Email: </label>
              <input
                type="text"
                placeholder="Your email"
                className="h-10 w-96 border mt-2 p-2 outline-none"
              />
            </div>

            {/* Button */}
            <div className="items-center justify-center h-14 w-full my-4 space-x-4">
              <button className="rounded-sm font-bold text-white px-6 py-2 bg-green-600 hover:bg-green-900">
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
