//데이터서비스 API 활용
var tranId = 'NRFCFWZ99999'; //호출하고자 하는 데이터서비스 ID
var panelId = this.getPanelId(); //getPanelId()는 패널컴포넌트/지역컴포넌트에서 제한적으로 사용할 수 있다
var message = this.sendMessage;
var requestOptions = {"progress" : false}; //process 로딩바 보이기(true *default), 숨기기(false)
sfmijs.sendRequest(tranId, panelId, message, this.successCallback, this.errorCallBack, requestOptions);