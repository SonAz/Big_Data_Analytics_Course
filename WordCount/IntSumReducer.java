package workcount;

import java.io.IOException;
import java.util.StringTokenizer;


import org.apache.hadoop.io.InWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.mapreduce.Reducer;

public class IntSumReducer extends Reducer<Text, IntWritable, Text, IntWritable>  {	
	
	private IntWritable result  = new IntWritable();

public void reduce(Text  key,  Iterable<IntWritable> values,  Context context) throws IOException, InterruptedException    {
		// process values
		int sum = 0
for (IntWritable val : values)   {
	sum += val.get();
}
result.set(sum);
context.write(key,)

}
}

