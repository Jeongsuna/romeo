package testcases.C0026_RESLEAK__CWE404_Improper_Resource_Shutdown.s02;


import com.sun.org.slf4j.internal.Logger;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class test_good implements testa {

    private Logger logger;
    @Override
    public ApprovalDto insertApproval(ApprovalDto approvalDto){
        URLConnection con = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            String reqNo = StringUtil.nullToSpace(NexusRequestContextUtils.getUserInfo("sso.SSO_SABUN"));
            String reqName = StringUtil.nullToSpace(NexusRequestContextUtils.getUserInfo("sso.SSO_USERNAME"));
            List<CustDto> aprvList = approvalDto.getAprvList();
            long currMillis = System.currentTimeMillis();
            Date currDate = new Date(currMillis);
            Time currTime = new Time(currMillis);
            String currDateStr = new SimpleDateFormat("yyMMdd").format(currDate);
            String aprvId = commonDao.selectMaxAprvId(currDateStr);
            if (aprvId == null || StringUtil.isEmpty(aprvId)) {
                aprvId = currDateStr + VCMConstant.STR_0001;
            } else {
                int seq = Integer.parseInt(aprvId.substring(6));
                String nextSeq = VcmStrUtil.lpad(String.valueOf(seq + 1), 4, "0");
                aprvId = currDateStr + nextSeq;
            }
            CustDto requester = new CustDto();
            requester.setCustId(reqNo);
            requester.setGrade(VCMConstant.STR_A);
            requester.setRwtYn(VCMConstant.STR_N);
            aprvList.add(0, requester);
            approvalDto.setAprvId(aprvId);
            approvalDto.setAprvBusnSrvcScCd(VCMConstant.STR_01);
            approvalDto.setInptEno(reqNo);
            int insertDb = commonDao.insertApproval(approvalDto);
            if (insertDb <= 0) {
                throw NexusBizExceptionFactory.create("BNFWVCM80000");
            }
            VCMConstant env = VCMConstant.getInstance();
            String urlStr = env.getValue("server.mis.url").trim();
            URL url = new URL(urlStr);
            con = url.openConnection();
            con.setDoOutput(true);
            con.setUseCaches(false);
            out = new PrintWriter(con.getOutputStream()); // 이슈지점
            StringBuffer sb = new StringBuffer(1024);
            sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
            sb.append("<MYSINGLE>");
            sb.append("<LINE>");
            sb.append("<![CDATA[");
            sb.append("11|" + aprvId + "\n");
            sb.append("12|00|A|" + currDate + " " + currTime + "|" + reqNo + "|" + reqName + "||" + "\n");
            IntStream.range(0, aprvList.size()).forEach(idx -> {
                if (idx == 0) {
                    return;
                }
                CustDto apprDto = aprvList.get(idx);
                String order = VcmStrUtil.lpad(String.valueOf(idx + 1), 2, "0");
                String type = apprDto.getGrade();
                String apprNo = apprDto.getCustId();
                String apprNm = apprDto.getkName();
                sb.append("12|" + order + "|" + type + "||" + apprNo + "|" + apprNm + "||" + "\n");
            });
            String title = approvalDto.getTitle();
            String trtrOpin = approvalDto.getTrtrOpin();
            sb.append("]]>");
            sb.append("</LINE>");
            sb.append("<BODY>");
            sb.append("<![CDATA[");
            sb.append("<html>");
            sb.append("<p> 제 목  - ");
            sb.append(title);
            sb.append("</p>\n");
            sb.append("<p> 본 문  - </p>");
            sb.append(trtrOpin);
            sb.append("</html>");
            sb.append("]]>");
            sb.append("</BODY>");
            sb.append("</MYSINGLE>");
            StringBuffer bufdata = new StringBuffer(1024);
            bufdata.append(url_encoding("userid", reqNo));
            bufdata.append(url_encoding("systemid", VCMConstant.CS_SYSTEM_ID));
            bufdata.append(url_encoding("businessid", VCMConstant.BUSINESS_ID));
            bufdata.append(url_encoding("bodytype", VCMConstant.CONST_html));
            bufdata.append(url_encoding("title", title));
            bufdata.append(url_encoding("regidoc", VCMConstant.STR_Y));
            bufdata.append(url_encoding("legacyout", sb.toString()));
            bufdata.append(url_encoding("attaches", VCMConstant.EMPTY));
            out.print(bufdata.toString());
            out.flush();
            InputStream is = con.getInputStream();
            in = new BufferedReader(new InputStreamReader(is), 8 * 1024);
            String line = null;
            StringBuffer strrt = new StringBuffer(1024);
            while ((line = in.readLine()) != null) {
                strrt.append(line);
            }
            String result = strrt.toString();
            if (result.indexOf(VCMConstant.REPLY_CODE) > -1) {
                approvalDto.setResult(VCMConstant.STR_Y);
            } else {
                approvalDto.setResult(VCMConstant.STR_N);
            }
        } catch (Exception e) {
            if (logger.isDebugEnabled()) {
                logger.debug("■■■■■■■ [ERROR] CommonService ■■■■■■■ insertApproval : " + e);
            }
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    logger.error("■■■■■■■ [ERROR] CommonService ■■■■■■■ insertApproval : " + e);
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error("■■■■■■■ [ERROR] CommonService ■■■■■■■ insertApproval : " + e);
                }
            }
        }
        return approvalDto;
    }

    private boolean url_encoding(String userid, String reqNo) {
        return false;
    }


    private static class StringUtil {
        public static String nullToSpace(String userInfo) {
            return userInfo;
        }

        public static boolean isEmpty(String aprvId) {
            return false;
        }
    }

    private static class NexusRequestContextUtils {
        public static String getUserInfo(String s) {
            return s;
        }
    }

    private static class NexusBizExceptionFactory {
        public static Exception create(String bnfwvcm80000) {
            return null;
        }
    }
}
