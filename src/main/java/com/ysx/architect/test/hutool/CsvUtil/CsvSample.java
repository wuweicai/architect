package com.ysx.architect.test.hutool.CsvUtil;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.text.csv.*;
import cn.hutool.core.util.CharsetUtil;

import java.util.List;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.CsvUtil
 * @ClassName: CsvSample
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 14:01
 * @Version: 1.0
 */
public class CsvSample {
    public static void main(String[] args) throws Exception {
        CsvWriter writer = CsvUtil.getWriter("e:/testWrite.csv", CharsetUtil.CHARSET_UTF_8);
        //按行写出
        writer.write(
                new String[] {"a1", "b1", "c1"},
                new String[] {"a2", "b2", "c2"},
                new String[] {"a3", "b3", "c3"}
        );

        CsvReader reader = CsvUtil.getReader();
        //从文件中读取CSV数据
        CsvData data = reader.read(FileUtil.file("e:/testWrite.csv"));
        List<CsvRow> rows = data.getRows();
        //遍历行
        for (CsvRow csvRow : rows) {
            //getRawList返回一个List列表，列表的每一项为CSV中的一个单元格（既逗号分隔部分）
            Console.log(csvRow.getRawList());
        }
    }
}
