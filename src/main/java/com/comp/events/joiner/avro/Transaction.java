/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Transaction extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 623385730721165792L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Transaction\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"IBAN\",\"type\":\"string\"},{\"name\":\"Date\",\"type\":\"long\"},{\"name\":\"PaymentType\",\"type\":\"string\"},{\"name\":\"Details\",\"type\":\"string\"},{\"name\":\"MoneyOut\",\"type\":\"double\"},{\"name\":\"MoneyIn\",\"type\":\"double\"},{\"name\":\"Balance\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Transaction> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Transaction> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Transaction> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Transaction> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Transaction> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Transaction to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Transaction from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Transaction instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Transaction fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence IBAN;
  private long Date;
  private java.lang.CharSequence PaymentType;
  private java.lang.CharSequence Details;
  private double MoneyOut;
  private double MoneyIn;
  private double Balance;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Transaction() {}

  /**
   * All-args constructor.
   * @param IBAN The new value for IBAN
   * @param Date The new value for Date
   * @param PaymentType The new value for PaymentType
   * @param Details The new value for Details
   * @param MoneyOut The new value for MoneyOut
   * @param MoneyIn The new value for MoneyIn
   * @param Balance The new value for Balance
   */
  public Transaction(java.lang.CharSequence IBAN, java.lang.Long Date, java.lang.CharSequence PaymentType, java.lang.CharSequence Details, java.lang.Double MoneyOut, java.lang.Double MoneyIn, java.lang.Double Balance) {
    this.IBAN = IBAN;
    this.Date = Date;
    this.PaymentType = PaymentType;
    this.Details = Details;
    this.MoneyOut = MoneyOut;
    this.MoneyIn = MoneyIn;
    this.Balance = Balance;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return IBAN;
    case 1: return Date;
    case 2: return PaymentType;
    case 3: return Details;
    case 4: return MoneyOut;
    case 5: return MoneyIn;
    case 6: return Balance;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: IBAN = (java.lang.CharSequence)value$; break;
    case 1: Date = (java.lang.Long)value$; break;
    case 2: PaymentType = (java.lang.CharSequence)value$; break;
    case 3: Details = (java.lang.CharSequence)value$; break;
    case 4: MoneyOut = (java.lang.Double)value$; break;
    case 5: MoneyIn = (java.lang.Double)value$; break;
    case 6: Balance = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'IBAN' field.
   * @return The value of the 'IBAN' field.
   */
  public java.lang.CharSequence getIBAN() {
    return IBAN;
  }


  /**
   * Sets the value of the 'IBAN' field.
   * @param value the value to set.
   */
  public void setIBAN(java.lang.CharSequence value) {
    this.IBAN = value;
  }

  /**
   * Gets the value of the 'Date' field.
   * @return The value of the 'Date' field.
   */
  public long getDate() {
    return Date;
  }


  /**
   * Sets the value of the 'Date' field.
   * @param value the value to set.
   */
  public void setDate(long value) {
    this.Date = value;
  }

  /**
   * Gets the value of the 'PaymentType' field.
   * @return The value of the 'PaymentType' field.
   */
  public java.lang.CharSequence getPaymentType() {
    return PaymentType;
  }


  /**
   * Sets the value of the 'PaymentType' field.
   * @param value the value to set.
   */
  public void setPaymentType(java.lang.CharSequence value) {
    this.PaymentType = value;
  }

  /**
   * Gets the value of the 'Details' field.
   * @return The value of the 'Details' field.
   */
  public java.lang.CharSequence getDetails() {
    return Details;
  }


  /**
   * Sets the value of the 'Details' field.
   * @param value the value to set.
   */
  public void setDetails(java.lang.CharSequence value) {
    this.Details = value;
  }

  /**
   * Gets the value of the 'MoneyOut' field.
   * @return The value of the 'MoneyOut' field.
   */
  public double getMoneyOut() {
    return MoneyOut;
  }


  /**
   * Sets the value of the 'MoneyOut' field.
   * @param value the value to set.
   */
  public void setMoneyOut(double value) {
    this.MoneyOut = value;
  }

  /**
   * Gets the value of the 'MoneyIn' field.
   * @return The value of the 'MoneyIn' field.
   */
  public double getMoneyIn() {
    return MoneyIn;
  }


  /**
   * Sets the value of the 'MoneyIn' field.
   * @param value the value to set.
   */
  public void setMoneyIn(double value) {
    this.MoneyIn = value;
  }

  /**
   * Gets the value of the 'Balance' field.
   * @return The value of the 'Balance' field.
   */
  public double getBalance() {
    return Balance;
  }


  /**
   * Sets the value of the 'Balance' field.
   * @param value the value to set.
   */
  public void setBalance(double value) {
    this.Balance = value;
  }

  /**
   * Creates a new Transaction RecordBuilder.
   * @return A new Transaction RecordBuilder
   */
  public static avro.Transaction.Builder newBuilder() {
    return new avro.Transaction.Builder();
  }

  /**
   * Creates a new Transaction RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Transaction RecordBuilder
   */
  public static avro.Transaction.Builder newBuilder(avro.Transaction.Builder other) {
    if (other == null) {
      return new avro.Transaction.Builder();
    } else {
      return new avro.Transaction.Builder(other);
    }
  }

  /**
   * Creates a new Transaction RecordBuilder by copying an existing Transaction instance.
   * @param other The existing instance to copy.
   * @return A new Transaction RecordBuilder
   */
  public static avro.Transaction.Builder newBuilder(avro.Transaction other) {
    if (other == null) {
      return new avro.Transaction.Builder();
    } else {
      return new avro.Transaction.Builder(other);
    }
  }

  /**
   * RecordBuilder for Transaction instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Transaction>
    implements org.apache.avro.data.RecordBuilder<Transaction> {

    private java.lang.CharSequence IBAN;
    private long Date;
    private java.lang.CharSequence PaymentType;
    private java.lang.CharSequence Details;
    private double MoneyOut;
    private double MoneyIn;
    private double Balance;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.Transaction.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.IBAN)) {
        this.IBAN = data().deepCopy(fields()[0].schema(), other.IBAN);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.Date)) {
        this.Date = data().deepCopy(fields()[1].schema(), other.Date);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.PaymentType)) {
        this.PaymentType = data().deepCopy(fields()[2].schema(), other.PaymentType);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.Details)) {
        this.Details = data().deepCopy(fields()[3].schema(), other.Details);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.MoneyOut)) {
        this.MoneyOut = data().deepCopy(fields()[4].schema(), other.MoneyOut);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.MoneyIn)) {
        this.MoneyIn = data().deepCopy(fields()[5].schema(), other.MoneyIn);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.Balance)) {
        this.Balance = data().deepCopy(fields()[6].schema(), other.Balance);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing Transaction instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.Transaction other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.IBAN)) {
        this.IBAN = data().deepCopy(fields()[0].schema(), other.IBAN);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Date)) {
        this.Date = data().deepCopy(fields()[1].schema(), other.Date);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.PaymentType)) {
        this.PaymentType = data().deepCopy(fields()[2].schema(), other.PaymentType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Details)) {
        this.Details = data().deepCopy(fields()[3].schema(), other.Details);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.MoneyOut)) {
        this.MoneyOut = data().deepCopy(fields()[4].schema(), other.MoneyOut);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.MoneyIn)) {
        this.MoneyIn = data().deepCopy(fields()[5].schema(), other.MoneyIn);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Balance)) {
        this.Balance = data().deepCopy(fields()[6].schema(), other.Balance);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'IBAN' field.
      * @return The value.
      */
    public java.lang.CharSequence getIBAN() {
      return IBAN;
    }


    /**
      * Sets the value of the 'IBAN' field.
      * @param value The value of 'IBAN'.
      * @return This builder.
      */
    public avro.Transaction.Builder setIBAN(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.IBAN = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'IBAN' field has been set.
      * @return True if the 'IBAN' field has been set, false otherwise.
      */
    public boolean hasIBAN() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'IBAN' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearIBAN() {
      IBAN = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Date' field.
      * @return The value.
      */
    public long getDate() {
      return Date;
    }


    /**
      * Sets the value of the 'Date' field.
      * @param value The value of 'Date'.
      * @return This builder.
      */
    public avro.Transaction.Builder setDate(long value) {
      validate(fields()[1], value);
      this.Date = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Date' field has been set.
      * @return True if the 'Date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Date' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearDate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'PaymentType' field.
      * @return The value.
      */
    public java.lang.CharSequence getPaymentType() {
      return PaymentType;
    }


    /**
      * Sets the value of the 'PaymentType' field.
      * @param value The value of 'PaymentType'.
      * @return This builder.
      */
    public avro.Transaction.Builder setPaymentType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.PaymentType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'PaymentType' field has been set.
      * @return True if the 'PaymentType' field has been set, false otherwise.
      */
    public boolean hasPaymentType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'PaymentType' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearPaymentType() {
      PaymentType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Details' field.
      * @return The value.
      */
    public java.lang.CharSequence getDetails() {
      return Details;
    }


    /**
      * Sets the value of the 'Details' field.
      * @param value The value of 'Details'.
      * @return This builder.
      */
    public avro.Transaction.Builder setDetails(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.Details = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Details' field has been set.
      * @return True if the 'Details' field has been set, false otherwise.
      */
    public boolean hasDetails() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Details' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearDetails() {
      Details = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'MoneyOut' field.
      * @return The value.
      */
    public double getMoneyOut() {
      return MoneyOut;
    }


    /**
      * Sets the value of the 'MoneyOut' field.
      * @param value The value of 'MoneyOut'.
      * @return This builder.
      */
    public avro.Transaction.Builder setMoneyOut(double value) {
      validate(fields()[4], value);
      this.MoneyOut = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'MoneyOut' field has been set.
      * @return True if the 'MoneyOut' field has been set, false otherwise.
      */
    public boolean hasMoneyOut() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'MoneyOut' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearMoneyOut() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'MoneyIn' field.
      * @return The value.
      */
    public double getMoneyIn() {
      return MoneyIn;
    }


    /**
      * Sets the value of the 'MoneyIn' field.
      * @param value The value of 'MoneyIn'.
      * @return This builder.
      */
    public avro.Transaction.Builder setMoneyIn(double value) {
      validate(fields()[5], value);
      this.MoneyIn = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'MoneyIn' field has been set.
      * @return True if the 'MoneyIn' field has been set, false otherwise.
      */
    public boolean hasMoneyIn() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'MoneyIn' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearMoneyIn() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'Balance' field.
      * @return The value.
      */
    public double getBalance() {
      return Balance;
    }


    /**
      * Sets the value of the 'Balance' field.
      * @param value The value of 'Balance'.
      * @return This builder.
      */
    public avro.Transaction.Builder setBalance(double value) {
      validate(fields()[6], value);
      this.Balance = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'Balance' field has been set.
      * @return True if the 'Balance' field has been set, false otherwise.
      */
    public boolean hasBalance() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'Balance' field.
      * @return This builder.
      */
    public avro.Transaction.Builder clearBalance() {
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Transaction build() {
      try {
        Transaction record = new Transaction();
        record.IBAN = fieldSetFlags()[0] ? this.IBAN : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Date = fieldSetFlags()[1] ? this.Date : (java.lang.Long) defaultValue(fields()[1]);
        record.PaymentType = fieldSetFlags()[2] ? this.PaymentType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.Details = fieldSetFlags()[3] ? this.Details : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.MoneyOut = fieldSetFlags()[4] ? this.MoneyOut : (java.lang.Double) defaultValue(fields()[4]);
        record.MoneyIn = fieldSetFlags()[5] ? this.MoneyIn : (java.lang.Double) defaultValue(fields()[5]);
        record.Balance = fieldSetFlags()[6] ? this.Balance : (java.lang.Double) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Transaction>
    WRITER$ = (org.apache.avro.io.DatumWriter<Transaction>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Transaction>
    READER$ = (org.apache.avro.io.DatumReader<Transaction>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.IBAN);

    out.writeLong(this.Date);

    out.writeString(this.PaymentType);

    out.writeString(this.Details);

    out.writeDouble(this.MoneyOut);

    out.writeDouble(this.MoneyIn);

    out.writeDouble(this.Balance);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.IBAN = in.readString(this.IBAN instanceof Utf8 ? (Utf8)this.IBAN : null);

      this.Date = in.readLong();

      this.PaymentType = in.readString(this.PaymentType instanceof Utf8 ? (Utf8)this.PaymentType : null);

      this.Details = in.readString(this.Details instanceof Utf8 ? (Utf8)this.Details : null);

      this.MoneyOut = in.readDouble();

      this.MoneyIn = in.readDouble();

      this.Balance = in.readDouble();

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.IBAN = in.readString(this.IBAN instanceof Utf8 ? (Utf8)this.IBAN : null);
          break;

        case 1:
          this.Date = in.readLong();
          break;

        case 2:
          this.PaymentType = in.readString(this.PaymentType instanceof Utf8 ? (Utf8)this.PaymentType : null);
          break;

        case 3:
          this.Details = in.readString(this.Details instanceof Utf8 ? (Utf8)this.Details : null);
          break;

        case 4:
          this.MoneyOut = in.readDouble();
          break;

        case 5:
          this.MoneyIn = in.readDouble();
          break;

        case 6:
          this.Balance = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










