public class Mapper {
    package workcount;
    
    import java.io.IOException;
    import java.util.StringTokenizer;
    
    
    import org.apache.hadoop.io.InWritable;
    import org.apache.hadoop.io.LongWritable;
    import org.apache.hadoop.io.Text;
    import org.apache.hadoop.io.mapreduce.Mapper;
    
    public class TokenizerMapper extends Mapper<LongWritable, Text, Text, IntWritable>  {
        
    private Text word = new Text();	
    
    public void map(LongWritable  key,  Text values,  Context context) throws IOException, InterruptedException    {
        
    StringTokenizer itr = new StringTokenizer(value.toString()); 
            while(itr.hasMoreTokens())	{
    
                word.set(iter.nextToken()) ;  // đọc lấy từ
    
        context.write(word, new IntWritetable(1)); 
    }
    }
    }
    
}


import javax.naming.Context;

