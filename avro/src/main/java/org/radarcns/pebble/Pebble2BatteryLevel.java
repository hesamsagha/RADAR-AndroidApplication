/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.radarcns.pebble;  
@SuppressWarnings("all")
/** Device battery level. */
@org.apache.avro.specific.AvroGenerated
public class Pebble2BatteryLevel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pebble2BatteryLevel\",\"namespace\":\"org.radarcns.pebble\",\"doc\":\"Device battery level.\",\"fields\":[{\"name\":\"time\",\"type\":\"double\",\"doc\":\"device timestamp in UTC (s)\"},{\"name\":\"timeReceived\",\"type\":\"double\",\"doc\":\"device receiver timestamp in UTC (s)\"},{\"name\":\"batteryLevel\",\"type\":\"float\",\"doc\":\"battery level from 0 to 1\"},{\"name\":\"batteryIsCharging\",\"type\":\"boolean\",\"doc\":\"whether the battery is being charged\"},{\"name\":\"batteryIsPlugged\",\"type\":\"boolean\",\"doc\":\"whether the battery charger cable is plugged in\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** device timestamp in UTC (s) */
  @Deprecated public double time;
  /** device receiver timestamp in UTC (s) */
  @Deprecated public double timeReceived;
  /** battery level from 0 to 1 */
  @Deprecated public float batteryLevel;
  /** whether the battery is being charged */
  @Deprecated public boolean batteryIsCharging;
  /** whether the battery charger cable is plugged in */
  @Deprecated public boolean batteryIsPlugged;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Pebble2BatteryLevel() {}

  /**
   * All-args constructor.
   */
  public Pebble2BatteryLevel(java.lang.Double time, java.lang.Double timeReceived, java.lang.Float batteryLevel, java.lang.Boolean batteryIsCharging, java.lang.Boolean batteryIsPlugged) {
    this.time = time;
    this.timeReceived = timeReceived;
    this.batteryLevel = batteryLevel;
    this.batteryIsCharging = batteryIsCharging;
    this.batteryIsPlugged = batteryIsPlugged;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return time;
    case 1: return timeReceived;
    case 2: return batteryLevel;
    case 3: return batteryIsCharging;
    case 4: return batteryIsPlugged;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: time = (java.lang.Double)value$; break;
    case 1: timeReceived = (java.lang.Double)value$; break;
    case 2: batteryLevel = (java.lang.Float)value$; break;
    case 3: batteryIsCharging = (java.lang.Boolean)value$; break;
    case 4: batteryIsPlugged = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'time' field.
   * device timestamp in UTC (s)   */
  public java.lang.Double getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * device timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTime(java.lang.Double value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   */
  public java.lang.Double getTimeReceived() {
    return timeReceived;
  }

  /**
   * Sets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTimeReceived(java.lang.Double value) {
    this.timeReceived = value;
  }

  /**
   * Gets the value of the 'batteryLevel' field.
   * battery level from 0 to 1   */
  public java.lang.Float getBatteryLevel() {
    return batteryLevel;
  }

  /**
   * Sets the value of the 'batteryLevel' field.
   * battery level from 0 to 1   * @param value the value to set.
   */
  public void setBatteryLevel(java.lang.Float value) {
    this.batteryLevel = value;
  }

  /**
   * Gets the value of the 'batteryIsCharging' field.
   * whether the battery is being charged   */
  public java.lang.Boolean getBatteryIsCharging() {
    return batteryIsCharging;
  }

  /**
   * Sets the value of the 'batteryIsCharging' field.
   * whether the battery is being charged   * @param value the value to set.
   */
  public void setBatteryIsCharging(java.lang.Boolean value) {
    this.batteryIsCharging = value;
  }

  /**
   * Gets the value of the 'batteryIsPlugged' field.
   * whether the battery charger cable is plugged in   */
  public java.lang.Boolean getBatteryIsPlugged() {
    return batteryIsPlugged;
  }

  /**
   * Sets the value of the 'batteryIsPlugged' field.
   * whether the battery charger cable is plugged in   * @param value the value to set.
   */
  public void setBatteryIsPlugged(java.lang.Boolean value) {
    this.batteryIsPlugged = value;
  }

  /** Creates a new Pebble2BatteryLevel RecordBuilder */
  public static org.radarcns.pebble.Pebble2BatteryLevel.Builder newBuilder() {
    return new org.radarcns.pebble.Pebble2BatteryLevel.Builder();
  }
  
  /** Creates a new Pebble2BatteryLevel RecordBuilder by copying an existing Builder */
  public static org.radarcns.pebble.Pebble2BatteryLevel.Builder newBuilder(org.radarcns.pebble.Pebble2BatteryLevel.Builder other) {
    return new org.radarcns.pebble.Pebble2BatteryLevel.Builder(other);
  }
  
  /** Creates a new Pebble2BatteryLevel RecordBuilder by copying an existing Pebble2BatteryLevel instance */
  public static org.radarcns.pebble.Pebble2BatteryLevel.Builder newBuilder(org.radarcns.pebble.Pebble2BatteryLevel other) {
    return new org.radarcns.pebble.Pebble2BatteryLevel.Builder(other);
  }
  
  /**
   * RecordBuilder for Pebble2BatteryLevel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pebble2BatteryLevel>
    implements org.apache.avro.data.RecordBuilder<Pebble2BatteryLevel> {

    private double time;
    private double timeReceived;
    private float batteryLevel;
    private boolean batteryIsCharging;
    private boolean batteryIsPlugged;

    /** Creates a new Builder */
    private Builder() {
      super(org.radarcns.pebble.Pebble2BatteryLevel.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.radarcns.pebble.Pebble2BatteryLevel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.batteryLevel)) {
        this.batteryLevel = data().deepCopy(fields()[2].schema(), other.batteryLevel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.batteryIsCharging)) {
        this.batteryIsCharging = data().deepCopy(fields()[3].schema(), other.batteryIsCharging);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.batteryIsPlugged)) {
        this.batteryIsPlugged = data().deepCopy(fields()[4].schema(), other.batteryIsPlugged);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Pebble2BatteryLevel instance */
    private Builder(org.radarcns.pebble.Pebble2BatteryLevel other) {
            super(org.radarcns.pebble.Pebble2BatteryLevel.SCHEMA$);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.batteryLevel)) {
        this.batteryLevel = data().deepCopy(fields()[2].schema(), other.batteryLevel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.batteryIsCharging)) {
        this.batteryIsCharging = data().deepCopy(fields()[3].schema(), other.batteryIsCharging);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.batteryIsPlugged)) {
        this.batteryIsPlugged = data().deepCopy(fields()[4].schema(), other.batteryIsPlugged);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'time' field */
    public java.lang.Double getTime() {
      return time;
    }
    
    /** Sets the value of the 'time' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder setTime(double value) {
      validate(fields()[0], value);
      this.time = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'time' field has been set */
    public boolean hasTime() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'time' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder clearTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeReceived' field */
    public java.lang.Double getTimeReceived() {
      return timeReceived;
    }
    
    /** Sets the value of the 'timeReceived' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder setTimeReceived(double value) {
      validate(fields()[1], value);
      this.timeReceived = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeReceived' field has been set */
    public boolean hasTimeReceived() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeReceived' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder clearTimeReceived() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'batteryLevel' field */
    public java.lang.Float getBatteryLevel() {
      return batteryLevel;
    }
    
    /** Sets the value of the 'batteryLevel' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder setBatteryLevel(float value) {
      validate(fields()[2], value);
      this.batteryLevel = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'batteryLevel' field has been set */
    public boolean hasBatteryLevel() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'batteryLevel' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder clearBatteryLevel() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'batteryIsCharging' field */
    public java.lang.Boolean getBatteryIsCharging() {
      return batteryIsCharging;
    }
    
    /** Sets the value of the 'batteryIsCharging' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder setBatteryIsCharging(boolean value) {
      validate(fields()[3], value);
      this.batteryIsCharging = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'batteryIsCharging' field has been set */
    public boolean hasBatteryIsCharging() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'batteryIsCharging' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder clearBatteryIsCharging() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'batteryIsPlugged' field */
    public java.lang.Boolean getBatteryIsPlugged() {
      return batteryIsPlugged;
    }
    
    /** Sets the value of the 'batteryIsPlugged' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder setBatteryIsPlugged(boolean value) {
      validate(fields()[4], value);
      this.batteryIsPlugged = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'batteryIsPlugged' field has been set */
    public boolean hasBatteryIsPlugged() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'batteryIsPlugged' field */
    public org.radarcns.pebble.Pebble2BatteryLevel.Builder clearBatteryIsPlugged() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Pebble2BatteryLevel build() {
      try {
        Pebble2BatteryLevel record = new Pebble2BatteryLevel();
        record.time = fieldSetFlags()[0] ? this.time : (java.lang.Double) defaultValue(fields()[0]);
        record.timeReceived = fieldSetFlags()[1] ? this.timeReceived : (java.lang.Double) defaultValue(fields()[1]);
        record.batteryLevel = fieldSetFlags()[2] ? this.batteryLevel : (java.lang.Float) defaultValue(fields()[2]);
        record.batteryIsCharging = fieldSetFlags()[3] ? this.batteryIsCharging : (java.lang.Boolean) defaultValue(fields()[3]);
        record.batteryIsPlugged = fieldSetFlags()[4] ? this.batteryIsPlugged : (java.lang.Boolean) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}