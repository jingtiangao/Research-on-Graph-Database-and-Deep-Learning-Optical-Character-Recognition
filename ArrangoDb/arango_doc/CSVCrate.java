import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * 创建CSV文件
 */
public class CSVCrate {

    /**
     * 创建CSV文件
     */

    public static void createCSV() {
        
        // 表格头
        Object[] head = {"_key"};
        List<Object> headList = Arrays.asList(head);

        //数据
        List<List<Object>> dataList = new ArrayList<List<Object>>();
        List<Object> rowList = null;
        //41652231 21000000
        for (int i = 21000000; i <41652231 ; i++) {
            rowList = new ArrayList<Object>();
            rowList.add("" + i);
            System.out.println(i);
            dataList.add(rowList);
        }
        
        String fileName = "qaq2.csv";//文件名称
        String filePath = "/home/gaochuyang/ucas/arango_doc/"; //文件路径
        
        File csvFile = null;
        BufferedWriter csvWtriter = null;
        try {
            csvFile = new File(filePath + fileName);
            File parent = csvFile.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            csvFile.createNewFile();

            // GB2312使正确读取分隔符","
            csvWtriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csvFile), "GB2312"), 1024);
            
            //文件下载，使用如下代码
//            response.setContentType("application/csv;charset=gb18030");
//            response.setHeader("Content-disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
//            ServletOutputStream out = response.getOutputStream();
//            csvWtriter = new BufferedWriter(new OutputStreamWriter(out, "GB2312"), 1024);
            
            int num = headList.size() / 2;
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < num; i++) {
                buffer.append(" ,");
            }
            //csvWtriter.write(buffer.toString() + fileName + buffer.toString());
            //csvWtriter.newLine();

            // 写入文件头部
            writeRow(headList, csvWtriter);

            // 写入文件内容
            for (List<Object> row : dataList) {
                writeRow(row, csvWtriter);
            }
            csvWtriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                csvWtriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * 写一行数据
     * @param row 数据列表
     * @param csvWriter
     * @throws IOException
     */
    private static void writeRow(List<Object> row, BufferedWriter csvWriter) throws IOException {
        for (Object data : row) {
            StringBuffer sb = new StringBuffer();
            String rowStr = sb.append("\"").append(data).append("\",").toString();
            csvWriter.write(rowStr);
        }
        csvWriter.newLine();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 createCSV();
		 System.out.print("fin");
	}
}
