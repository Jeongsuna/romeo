// 저수준 메서드 호출
axios({ method : 'GET', }).then((response) => {})
// get 메서드
axios.get('/nexusDs/NRFCFPC00001', {}).then((response) => {})
// post, delete, put, head, options 도 동일한 패턴으로 점검 가능