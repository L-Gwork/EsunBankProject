<template>
    <div>
      <h1>員工座位系統</h1>
      <form @submit.prevent="submitForm">
        <select v-model="selectedItem">
          <option value="" disabled></option>
          <!-- 使用 v-for 從員工資料中渲染選項 -->
          <option v-for="employee in employees" :key="employee.id" :value="employee.id">
            {{ employee.name }}
          </option>
        </select>

        <button type="送出">Submit</button>
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
        },
        selectedItem: "",    // 這是下拉選單選中的值
        employees: []        // 這裡存放從後端獲取的員工資料
      };
    },
    created() {
    // 在元件創建時發送請求來獲取資料
    this.fetchEmployees();
    },
    methods: {
      fetchEmployees() {
      axios.get('http://localhost:8080/') 
        .then(response => {
          this.employees = response.data; 
        })
        .catch(error => {
          console.error("錯誤", error);
        });
    }
    }
  };
  </script>
  