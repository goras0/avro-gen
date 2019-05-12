package test.avro_gen;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;

import test.model.Event;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
			String schema = App.gen();
			
			System.out.println(schema);
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}
    }
    
    private static String gen() throws JsonMappingException{
    	ObjectMapper mapper = new ObjectMapper(new AvroFactory());
    	AvroSchemaGenerator gen = new AvroSchemaGenerator();
    	mapper.acceptJsonFormatVisitor(Event.class, gen);
    	AvroSchema schemaWrapper = gen.getGeneratedSchema();
    	org.apache.avro.Schema avroSchema = schemaWrapper.getAvroSchema();
    	String asJson = avroSchema.toString(true);
    	return asJson;
    }
}
