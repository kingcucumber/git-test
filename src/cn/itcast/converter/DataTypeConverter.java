package cn.itcast.converter;

import java.lang.reflect.Member;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DataTypeConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object target,
			Member member, String propertyName, Object value, Class toType) {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		try {
			if (toType == Date.class) {
				String[] params = (String[]) value;
				return dateFormat.parse(params[0]);
			} else if (toType == String.class) {
				Date date = (Date) value;
				return dateFormat.format(date);
			}
		} catch (ParseException e) {
		}
		return null;
	}
}
