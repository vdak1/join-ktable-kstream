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
public class Account extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4957042802655680981L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Account\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"Name\",\"type\":\"string\"},{\"name\":\"Address\",\"type\":\"string\"},{\"name\":\"SortCode\",\"type\":\"string\"},{\"name\":\"AccountNo\",\"type\":\"string\"},{\"name\":\"IBAN\",\"type\":\"string\"},{\"name\":\"BIC\",\"type\":\"string\"},{\"name\":\"Branch\",\"type\":\"string\"},{\"name\":\"AccountType\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Account> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Account> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Account> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Account> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Account> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Account to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Account from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Account instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Account fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence Name;
  private java.lang.CharSequence Address;
  private java.lang.CharSequence SortCode;
  private java.lang.CharSequence AccountNo;
  private java.lang.CharSequence IBAN;
  private java.lang.CharSequence BIC;
  private java.lang.CharSequence Branch;
  private java.lang.CharSequence AccountType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Account() {}

  /**
   * All-args constructor.
   * @param Name The new value for Name
   * @param Address The new value for Address
   * @param SortCode The new value for SortCode
   * @param AccountNo The new value for AccountNo
   * @param IBAN The new value for IBAN
   * @param BIC The new value for BIC
   * @param Branch The new value for Branch
   * @param AccountType The new value for AccountType
   */
  public Account(java.lang.CharSequence Name, java.lang.CharSequence Address, java.lang.CharSequence SortCode, java.lang.CharSequence AccountNo, java.lang.CharSequence IBAN, java.lang.CharSequence BIC, java.lang.CharSequence Branch, java.lang.CharSequence AccountType) {
    this.Name = Name;
    this.Address = Address;
    this.SortCode = SortCode;
    this.AccountNo = AccountNo;
    this.IBAN = IBAN;
    this.BIC = BIC;
    this.Branch = Branch;
    this.AccountType = AccountType;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Name;
    case 1: return Address;
    case 2: return SortCode;
    case 3: return AccountNo;
    case 4: return IBAN;
    case 5: return BIC;
    case 6: return Branch;
    case 7: return AccountType;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Name = (java.lang.CharSequence)value$; break;
    case 1: Address = (java.lang.CharSequence)value$; break;
    case 2: SortCode = (java.lang.CharSequence)value$; break;
    case 3: AccountNo = (java.lang.CharSequence)value$; break;
    case 4: IBAN = (java.lang.CharSequence)value$; break;
    case 5: BIC = (java.lang.CharSequence)value$; break;
    case 6: Branch = (java.lang.CharSequence)value$; break;
    case 7: AccountType = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Name' field.
   * @return The value of the 'Name' field.
   */
  public java.lang.CharSequence getName() {
    return Name;
  }


  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'Address' field.
   * @return The value of the 'Address' field.
   */
  public java.lang.CharSequence getAddress() {
    return Address;
  }


  /**
   * Sets the value of the 'Address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.Address = value;
  }

  /**
   * Gets the value of the 'SortCode' field.
   * @return The value of the 'SortCode' field.
   */
  public java.lang.CharSequence getSortCode() {
    return SortCode;
  }


  /**
   * Sets the value of the 'SortCode' field.
   * @param value the value to set.
   */
  public void setSortCode(java.lang.CharSequence value) {
    this.SortCode = value;
  }

  /**
   * Gets the value of the 'AccountNo' field.
   * @return The value of the 'AccountNo' field.
   */
  public java.lang.CharSequence getAccountNo() {
    return AccountNo;
  }


  /**
   * Sets the value of the 'AccountNo' field.
   * @param value the value to set.
   */
  public void setAccountNo(java.lang.CharSequence value) {
    this.AccountNo = value;
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
   * Gets the value of the 'BIC' field.
   * @return The value of the 'BIC' field.
   */
  public java.lang.CharSequence getBIC() {
    return BIC;
  }


  /**
   * Sets the value of the 'BIC' field.
   * @param value the value to set.
   */
  public void setBIC(java.lang.CharSequence value) {
    this.BIC = value;
  }

  /**
   * Gets the value of the 'Branch' field.
   * @return The value of the 'Branch' field.
   */
  public java.lang.CharSequence getBranch() {
    return Branch;
  }


  /**
   * Sets the value of the 'Branch' field.
   * @param value the value to set.
   */
  public void setBranch(java.lang.CharSequence value) {
    this.Branch = value;
  }

  /**
   * Gets the value of the 'AccountType' field.
   * @return The value of the 'AccountType' field.
   */
  public java.lang.CharSequence getAccountType() {
    return AccountType;
  }


  /**
   * Sets the value of the 'AccountType' field.
   * @param value the value to set.
   */
  public void setAccountType(java.lang.CharSequence value) {
    this.AccountType = value;
  }

  /**
   * Creates a new Account RecordBuilder.
   * @return A new Account RecordBuilder
   */
  public static avro.Account.Builder newBuilder() {
    return new avro.Account.Builder();
  }

  /**
   * Creates a new Account RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Account RecordBuilder
   */
  public static avro.Account.Builder newBuilder(avro.Account.Builder other) {
    if (other == null) {
      return new avro.Account.Builder();
    } else {
      return new avro.Account.Builder(other);
    }
  }

  /**
   * Creates a new Account RecordBuilder by copying an existing Account instance.
   * @param other The existing instance to copy.
   * @return A new Account RecordBuilder
   */
  public static avro.Account.Builder newBuilder(avro.Account other) {
    if (other == null) {
      return new avro.Account.Builder();
    } else {
      return new avro.Account.Builder(other);
    }
  }

  /**
   * RecordBuilder for Account instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Account>
    implements org.apache.avro.data.RecordBuilder<Account> {

    private java.lang.CharSequence Name;
    private java.lang.CharSequence Address;
    private java.lang.CharSequence SortCode;
    private java.lang.CharSequence AccountNo;
    private java.lang.CharSequence IBAN;
    private java.lang.CharSequence BIC;
    private java.lang.CharSequence Branch;
    private java.lang.CharSequence AccountType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.Account.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.Address)) {
        this.Address = data().deepCopy(fields()[1].schema(), other.Address);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.SortCode)) {
        this.SortCode = data().deepCopy(fields()[2].schema(), other.SortCode);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.AccountNo)) {
        this.AccountNo = data().deepCopy(fields()[3].schema(), other.AccountNo);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.IBAN)) {
        this.IBAN = data().deepCopy(fields()[4].schema(), other.IBAN);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.BIC)) {
        this.BIC = data().deepCopy(fields()[5].schema(), other.BIC);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.Branch)) {
        this.Branch = data().deepCopy(fields()[6].schema(), other.Branch);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.AccountType)) {
        this.AccountType = data().deepCopy(fields()[7].schema(), other.AccountType);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing Account instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.Account other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Address)) {
        this.Address = data().deepCopy(fields()[1].schema(), other.Address);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.SortCode)) {
        this.SortCode = data().deepCopy(fields()[2].schema(), other.SortCode);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.AccountNo)) {
        this.AccountNo = data().deepCopy(fields()[3].schema(), other.AccountNo);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.IBAN)) {
        this.IBAN = data().deepCopy(fields()[4].schema(), other.IBAN);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.BIC)) {
        this.BIC = data().deepCopy(fields()[5].schema(), other.BIC);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Branch)) {
        this.Branch = data().deepCopy(fields()[6].schema(), other.Branch);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.AccountType)) {
        this.AccountType = data().deepCopy(fields()[7].schema(), other.AccountType);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'Name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return Name;
    }


    /**
      * Sets the value of the 'Name' field.
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public avro.Account.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Name' field.
      * @return This builder.
      */
    public avro.Account.Builder clearName() {
      Name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return Address;
    }


    /**
      * Sets the value of the 'Address' field.
      * @param value The value of 'Address'.
      * @return This builder.
      */
    public avro.Account.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Address = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Address' field has been set.
      * @return True if the 'Address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Address' field.
      * @return This builder.
      */
    public avro.Account.Builder clearAddress() {
      Address = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'SortCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getSortCode() {
      return SortCode;
    }


    /**
      * Sets the value of the 'SortCode' field.
      * @param value The value of 'SortCode'.
      * @return This builder.
      */
    public avro.Account.Builder setSortCode(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.SortCode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'SortCode' field has been set.
      * @return True if the 'SortCode' field has been set, false otherwise.
      */
    public boolean hasSortCode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'SortCode' field.
      * @return This builder.
      */
    public avro.Account.Builder clearSortCode() {
      SortCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'AccountNo' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountNo() {
      return AccountNo;
    }


    /**
      * Sets the value of the 'AccountNo' field.
      * @param value The value of 'AccountNo'.
      * @return This builder.
      */
    public avro.Account.Builder setAccountNo(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.AccountNo = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'AccountNo' field has been set.
      * @return True if the 'AccountNo' field has been set, false otherwise.
      */
    public boolean hasAccountNo() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'AccountNo' field.
      * @return This builder.
      */
    public avro.Account.Builder clearAccountNo() {
      AccountNo = null;
      fieldSetFlags()[3] = false;
      return this;
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
    public avro.Account.Builder setIBAN(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.IBAN = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'IBAN' field has been set.
      * @return True if the 'IBAN' field has been set, false otherwise.
      */
    public boolean hasIBAN() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'IBAN' field.
      * @return This builder.
      */
    public avro.Account.Builder clearIBAN() {
      IBAN = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'BIC' field.
      * @return The value.
      */
    public java.lang.CharSequence getBIC() {
      return BIC;
    }


    /**
      * Sets the value of the 'BIC' field.
      * @param value The value of 'BIC'.
      * @return This builder.
      */
    public avro.Account.Builder setBIC(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.BIC = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'BIC' field has been set.
      * @return True if the 'BIC' field has been set, false otherwise.
      */
    public boolean hasBIC() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'BIC' field.
      * @return This builder.
      */
    public avro.Account.Builder clearBIC() {
      BIC = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'Branch' field.
      * @return The value.
      */
    public java.lang.CharSequence getBranch() {
      return Branch;
    }


    /**
      * Sets the value of the 'Branch' field.
      * @param value The value of 'Branch'.
      * @return This builder.
      */
    public avro.Account.Builder setBranch(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.Branch = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'Branch' field has been set.
      * @return True if the 'Branch' field has been set, false otherwise.
      */
    public boolean hasBranch() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'Branch' field.
      * @return This builder.
      */
    public avro.Account.Builder clearBranch() {
      Branch = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'AccountType' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountType() {
      return AccountType;
    }


    /**
      * Sets the value of the 'AccountType' field.
      * @param value The value of 'AccountType'.
      * @return This builder.
      */
    public avro.Account.Builder setAccountType(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.AccountType = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'AccountType' field has been set.
      * @return True if the 'AccountType' field has been set, false otherwise.
      */
    public boolean hasAccountType() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'AccountType' field.
      * @return This builder.
      */
    public avro.Account.Builder clearAccountType() {
      AccountType = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Account build() {
      try {
        Account record = new Account();
        record.Name = fieldSetFlags()[0] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Address = fieldSetFlags()[1] ? this.Address : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.SortCode = fieldSetFlags()[2] ? this.SortCode : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.AccountNo = fieldSetFlags()[3] ? this.AccountNo : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.IBAN = fieldSetFlags()[4] ? this.IBAN : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.BIC = fieldSetFlags()[5] ? this.BIC : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.Branch = fieldSetFlags()[6] ? this.Branch : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.AccountType = fieldSetFlags()[7] ? this.AccountType : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Account>
    WRITER$ = (org.apache.avro.io.DatumWriter<Account>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Account>
    READER$ = (org.apache.avro.io.DatumReader<Account>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.Name);

    out.writeString(this.Address);

    out.writeString(this.SortCode);

    out.writeString(this.AccountNo);

    out.writeString(this.IBAN);

    out.writeString(this.BIC);

    out.writeString(this.Branch);

    out.writeString(this.AccountType);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.Name = in.readString(this.Name instanceof Utf8 ? (Utf8)this.Name : null);

      this.Address = in.readString(this.Address instanceof Utf8 ? (Utf8)this.Address : null);

      this.SortCode = in.readString(this.SortCode instanceof Utf8 ? (Utf8)this.SortCode : null);

      this.AccountNo = in.readString(this.AccountNo instanceof Utf8 ? (Utf8)this.AccountNo : null);

      this.IBAN = in.readString(this.IBAN instanceof Utf8 ? (Utf8)this.IBAN : null);

      this.BIC = in.readString(this.BIC instanceof Utf8 ? (Utf8)this.BIC : null);

      this.Branch = in.readString(this.Branch instanceof Utf8 ? (Utf8)this.Branch : null);

      this.AccountType = in.readString(this.AccountType instanceof Utf8 ? (Utf8)this.AccountType : null);

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.Name = in.readString(this.Name instanceof Utf8 ? (Utf8)this.Name : null);
          break;

        case 1:
          this.Address = in.readString(this.Address instanceof Utf8 ? (Utf8)this.Address : null);
          break;

        case 2:
          this.SortCode = in.readString(this.SortCode instanceof Utf8 ? (Utf8)this.SortCode : null);
          break;

        case 3:
          this.AccountNo = in.readString(this.AccountNo instanceof Utf8 ? (Utf8)this.AccountNo : null);
          break;

        case 4:
          this.IBAN = in.readString(this.IBAN instanceof Utf8 ? (Utf8)this.IBAN : null);
          break;

        case 5:
          this.BIC = in.readString(this.BIC instanceof Utf8 ? (Utf8)this.BIC : null);
          break;

        case 6:
          this.Branch = in.readString(this.Branch instanceof Utf8 ? (Utf8)this.Branch : null);
          break;

        case 7:
          this.AccountType = in.readString(this.AccountType instanceof Utf8 ? (Utf8)this.AccountType : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










