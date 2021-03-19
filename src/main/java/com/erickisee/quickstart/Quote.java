package com.erickisee.quickstart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.util.ObjectUtils;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Quote {

    private Long id;

    private String quote;

    @Override
    public boolean equals (Object object){
        if (this == object)
            return true;
        if (!(object instanceof Quote))
            return false;
        Quote that = (Quote) object;
        return ObjectUtils.nullSafeEquals(this.getId(), that.getId());
    }
    
    @Override
    public int hashCode() {
  
      int hashValue = 17;
  
      hashValue = 37 * hashValue + ObjectUtils.nullSafeHashCode(getId());
  
      return hashValue;
    }
  
    @Override
    public String toString() {
      return getQuote();
    }

}
