function C0011_IMPRAUTHT_GOOD_01() {
    const express = require('express');
    function deleteContentFromDB(contentId) {
        //...
    }

    router.delete("/patched", (req, res) => {
        const contentId = req.body.contentId;
        const role = req.session.role;

        // 삭제 기능을 수행할 권한이 있는 경우에만 삭제 작업 수행
        if (role === "admin") {
            deleteContentFromDB(contentId);
            return res.send("삭제가 완료되었습니다.");
        } else {
            return res.send("권한이 없습니다.");
        }
    });
}
