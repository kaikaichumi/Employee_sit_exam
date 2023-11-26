<script setup>

// import SeatTable from './components/SeatTable.vue'

var floor = new Array(4);
var emp = new Array(4);
var empSeat = new Array(4);

async function fetchSeatData() {
    try {
        const response = await fetch("http://localhost:8090/seat")
        const data = await response.json()
        console.log(data);
        console.log(data.filter((seat) => seat.floorNum == '1'));
        for (var i = 0; i < 4; i++) {
            floor[i] = data.filter((seat) => seat.floorNum == i + 1)
        }
        console.log(floor);

    } catch (error) {
        console.error("Failed to fetch data", error);
    }
}

async function fetchEmployeeData() {
    try {
        const response = await fetch("http://localhost:8090/employee")
        const data = await response.json()
        console.log(data);
        emp = data;
        // console.log(data.filter((seat) => seat.floorNum == '1'));
        for (var i = 0; i < emp.length; i++) {
            empSeat[i] = data.filter((employee) => employee.seatID != null)
        }
        console.log(empSeat);

    } catch (error) {
        console.error("Failed to fetch data", error);
    }
}


fetchSeatData();
fetchEmployeeData();

</script>

<template>
    <table>
        <tbody>
            <div>
                <tr v-for="i in 4" :key="i">
                    <td v-for="item in floor[i - 1]" :key="item.seatNum">
                        <div>
                            {{ item.seatID }}
                            <h3 v-if="empSeat.includes(item.seatID)" class="chosed">{{ item.floorNum }}樓: 座位{{ item.seatNum
                            }} [員編:12345]</h3>
                            <h3 v-if="empSeat.includes(item.seatID)" class="empty">{{ item.floorNum }}樓: 座位{{
                                item.seatNum }}</h3>
                        </div>
                    </td>
                </tr>
            </div>
        </tbody>
    </table>
</template>

<style scoped>
td>div {
    width: 250px;
    height: 40px;
    text-align: center;
    font-family: "Microsoft JhengHei";
    font-weight: bold;
}

h3.empty {
    border-radius: 5px;
    margin: 5px;
    color: black;
    background-color: lightgray;
}

h3.chosed {
    border-radius: 5px;
    margin: 5px;
    color: aliceblue;
    background-color: red;
}

h3.select {
    border-radius: 5px;
    margin: 5px;
    color: black;
    background-color: lightgreen;
}
</style>