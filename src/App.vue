<template>
    <div id="app">
      <EmployeeForm />
    </div>
  </template>
  
  <script>
  // 引入 EmployeeForm 組件
  import EmployeeForm from './components/EmployeeForm.vue';
  
  export default {
    name: 'App',
    components: {
      EmployeeForm
    }
  };
  </script>
  
  <style>
  /* 可以在這裡加上樣式 */
  </style>
  