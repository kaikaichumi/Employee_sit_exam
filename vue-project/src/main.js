import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'

createApp(App).mount('#app')

// createApp({
//     data() {
//         return {
//             info: 'Ajax 测试!!'
//         }
//     },
//     mounted() {
//         axios
//             .get('http://localhost:8090/seat')
//             .then(response => (this.info = response))
//             .catch(function(error) { // 请求失败处理
//                 console.log(error);
//             });
//     }
// }).mount('#app2')