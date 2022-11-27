import axios from "axios";

// const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/employee";
const CREATE_EMPLOYEE_API_URL = "http://localhost:8080/api/employee/save";

class EmployeeServices {
  saveEmployee(employee) {
    return axios.post(CREATE_EMPLOYEE_API_URL, employee);
  }
}

export default new EmployeeServices();
