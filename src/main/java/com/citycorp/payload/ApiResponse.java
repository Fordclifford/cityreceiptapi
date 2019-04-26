package com.citycorp.payload;

public class ApiResponse extends RuntimeException
{
  private Boolean success;
  private String message;
   private String resourceName;
    private String fieldName;
    private Object fieldValue;
  
  public ApiResponse(Boolean success, String message, String resourceName, String fieldName, Object fieldValue)
  {
   super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    this.success = success;
    this.message = message;
  }
  
  public Boolean getSuccess()
  {
    return this.success;
  }
  
  public void setSuccess(Boolean success)
  {
    this.success = success;
  }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }
  

  @Override
  public String getMessage()
  {
    return this.message;
  }
  
  public void setMessage(String message)
  {
    this.message = message;
  }
}
