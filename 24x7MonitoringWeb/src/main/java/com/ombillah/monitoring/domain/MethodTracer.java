package com.ombillah.monitoring.domain;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Domain class to represent a method tracer.
 * 
 * @author Oussama M Billah
 * 
 */
public class MethodTracer extends BaseDomain {

	private static final long serialVersionUID = 1L;
	private String methodName;
	private double average;
	private double max;
	private double min;
	private double count;
	private Date creationDate;

	public MethodTracer() {
		// default constructor();
	}
	
	public MethodTracer(String methodName, double average, double max,
			double min, double count, Date creationDate) {

		this.methodName = methodName;
		this.average = average;
		this.max = max;
		this.min = min;
		this.count = count;
		this.creationDate = creationDate;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof MethodTracer)) {
			return false;
		}

		return EqualsBuilder.reflectionEquals(this, object);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.DEFAULT_STYLE);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
