<script setup>

import SeatTable from './SeatTable.vue'

</script>

<template>
  <SeatTable />
  <div>
    <div style="display:flex;">
      <div class="rectangle" style="background-color: lightgray;"></div>
      <h3>空位</h3>
    </div>
    <div style="display:flex;">
      <div class="rectangle" style="background-color: red;"></div>
      <h3>已占用</h3>
    </div>
    <div style="display:flex;">
      <div class="rectangle" style="background-color: lightgreen;"></div>
      <h3>請選擇</h3>
    </div>
  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
  align-items: flex-start;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

div.rectangle {
  border-radius: 5px;
  width: 30px;
  height: 20px;
  margin: 5px;
}

@media (min-width: 1024px) {

  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>