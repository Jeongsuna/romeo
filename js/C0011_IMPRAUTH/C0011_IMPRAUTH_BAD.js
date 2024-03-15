function C0011_IMPRAUTHT_BAD_01() {
    const express = require('express');
    function deleteContentFromDB(contentId) {
    //...
    }

    router.delete("/vuln", (req, res) => {
        const contentId = req.body.contentId;
        // 작업 요청을 하는 사용자의 권한 확인 없이 삭제 작업 수행
        deleteContentFromDB(contentId);
        return res.send("삭제가 완료되었습니다.");
    });
}
