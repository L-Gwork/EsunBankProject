<template>
    <div>
      <h1>員工座位系統</h1>
      <form @submit.prevent="submitForm">
        <input v-model="employee.empId" placeholder="Employee ID" />
        <input v-model="employee.name" placeholder="Name" />
        <input v-model="employee.email" placeholder="Email" />
        <input v-model="employee.floorSeatSeq" placeholder="Floor Seat Sequence" />
  
        <input v-model="seatingChart.floorSeatSeq" placeholder="Floor Seat Sequence" />
        <input v-model="seatingChart.floorNo" placeholder="Floor No" />
        <input v-model="seatingChart.seatNo" placeholder="Seat No" />
  
        <button type="submit">Submit</button>
      </form>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        employee: {
          empId: '',
          name: '',
          email: '',
          floorSeatSeq: '',
        },
        seatingChart: {
          floorSeatSeq: '',
          floorNo: '',
          seatNo: '',
        }
      };
    },
    methods: {
      async submitForm() {
        try {
          await axios.post('http://localhost:8080/api/employee/create', {
            employee: this.employee,
            seatingChart: this.seatingChart
          });
          alert('Employee and seating created successfully!');
        } catch (error) {
          console.error('There was an error!', error);
        }
      }
    }
  };
  </script>
  