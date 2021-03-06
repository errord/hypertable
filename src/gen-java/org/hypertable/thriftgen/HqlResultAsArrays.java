/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.hypertable.thriftgen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Same as HqlResult except with cell as array
 */
public class HqlResultAsArrays implements org.apache.thrift.TBase<HqlResultAsArrays, HqlResultAsArrays._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HqlResultAsArrays");

  private static final org.apache.thrift.protocol.TField RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("results", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CELLS_FIELD_DESC = new org.apache.thrift.protocol.TField("cells", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField SCANNER_FIELD_DESC = new org.apache.thrift.protocol.TField("scanner", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MUTATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("mutator", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HqlResultAsArraysStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HqlResultAsArraysTupleSchemeFactory());
  }

  public List<String> results; // optional
  public List<List<String>> cells; // optional
  public long scanner; // optional
  public long mutator; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULTS((short)1, "results"),
    CELLS((short)2, "cells"),
    SCANNER((short)3, "scanner"),
    MUTATOR((short)4, "mutator");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESULTS
          return RESULTS;
        case 2: // CELLS
          return CELLS;
        case 3: // SCANNER
          return SCANNER;
        case 4: // MUTATOR
          return MUTATOR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SCANNER_ISSET_ID = 0;
  private static final int __MUTATOR_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  private _Fields optionals[] = {_Fields.RESULTS,_Fields.CELLS,_Fields.SCANNER,_Fields.MUTATOR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULTS, new org.apache.thrift.meta_data.FieldMetaData("results", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CELLS, new org.apache.thrift.meta_data.FieldMetaData("cells", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST            , "CellAsArray"))));
    tmpMap.put(_Fields.SCANNER, new org.apache.thrift.meta_data.FieldMetaData("scanner", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MUTATOR, new org.apache.thrift.meta_data.FieldMetaData("mutator", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HqlResultAsArrays.class, metaDataMap);
  }

  public HqlResultAsArrays() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HqlResultAsArrays(HqlResultAsArrays other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetResults()) {
      List<String> __this__results = new ArrayList<String>();
      for (String other_element : other.results) {
        __this__results.add(other_element);
      }
      this.results = __this__results;
    }
    if (other.isSetCells()) {
      List<List<String>> __this__cells = new ArrayList<List<String>>();
      for (List<String> other_element : other.cells) {
        __this__cells.add(other_element);
      }
      this.cells = __this__cells;
    }
    this.scanner = other.scanner;
    this.mutator = other.mutator;
  }

  public HqlResultAsArrays deepCopy() {
    return new HqlResultAsArrays(this);
  }

  @Override
  public void clear() {
    this.results = null;
    this.cells = null;
    setScannerIsSet(false);
    this.scanner = 0;
    setMutatorIsSet(false);
    this.mutator = 0;
  }

  public int getResultsSize() {
    return (this.results == null) ? 0 : this.results.size();
  }

  public java.util.Iterator<String> getResultsIterator() {
    return (this.results == null) ? null : this.results.iterator();
  }

  public void addToResults(String elem) {
    if (this.results == null) {
      this.results = new ArrayList<String>();
    }
    this.results.add(elem);
  }

  public List<String> getResults() {
    return this.results;
  }

  public HqlResultAsArrays setResults(List<String> results) {
    this.results = results;
    return this;
  }

  public void unsetResults() {
    this.results = null;
  }

  /** Returns true if field results is set (has been assigned a value) and false otherwise */
  public boolean isSetResults() {
    return this.results != null;
  }

  public void setResultsIsSet(boolean value) {
    if (!value) {
      this.results = null;
    }
  }

  public int getCellsSize() {
    return (this.cells == null) ? 0 : this.cells.size();
  }

  public java.util.Iterator<List<String>> getCellsIterator() {
    return (this.cells == null) ? null : this.cells.iterator();
  }

  public void addToCells(List<String> elem) {
    if (this.cells == null) {
      this.cells = new ArrayList<List<String>>();
    }
    this.cells.add(elem);
  }

  public List<List<String>> getCells() {
    return this.cells;
  }

  public HqlResultAsArrays setCells(List<List<String>> cells) {
    this.cells = cells;
    return this;
  }

  public void unsetCells() {
    this.cells = null;
  }

  /** Returns true if field cells is set (has been assigned a value) and false otherwise */
  public boolean isSetCells() {
    return this.cells != null;
  }

  public void setCellsIsSet(boolean value) {
    if (!value) {
      this.cells = null;
    }
  }

  public long getScanner() {
    return this.scanner;
  }

  public HqlResultAsArrays setScanner(long scanner) {
    this.scanner = scanner;
    setScannerIsSet(true);
    return this;
  }

  public void unsetScanner() {
    __isset_bit_vector.clear(__SCANNER_ISSET_ID);
  }

  /** Returns true if field scanner is set (has been assigned a value) and false otherwise */
  public boolean isSetScanner() {
    return __isset_bit_vector.get(__SCANNER_ISSET_ID);
  }

  public void setScannerIsSet(boolean value) {
    __isset_bit_vector.set(__SCANNER_ISSET_ID, value);
  }

  public long getMutator() {
    return this.mutator;
  }

  public HqlResultAsArrays setMutator(long mutator) {
    this.mutator = mutator;
    setMutatorIsSet(true);
    return this;
  }

  public void unsetMutator() {
    __isset_bit_vector.clear(__MUTATOR_ISSET_ID);
  }

  /** Returns true if field mutator is set (has been assigned a value) and false otherwise */
  public boolean isSetMutator() {
    return __isset_bit_vector.get(__MUTATOR_ISSET_ID);
  }

  public void setMutatorIsSet(boolean value) {
    __isset_bit_vector.set(__MUTATOR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULTS:
      if (value == null) {
        unsetResults();
      } else {
        setResults((List<String>)value);
      }
      break;

    case CELLS:
      if (value == null) {
        unsetCells();
      } else {
        setCells((List<List<String>>)value);
      }
      break;

    case SCANNER:
      if (value == null) {
        unsetScanner();
      } else {
        setScanner((Long)value);
      }
      break;

    case MUTATOR:
      if (value == null) {
        unsetMutator();
      } else {
        setMutator((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULTS:
      return getResults();

    case CELLS:
      return getCells();

    case SCANNER:
      return Long.valueOf(getScanner());

    case MUTATOR:
      return Long.valueOf(getMutator());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULTS:
      return isSetResults();
    case CELLS:
      return isSetCells();
    case SCANNER:
      return isSetScanner();
    case MUTATOR:
      return isSetMutator();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HqlResultAsArrays)
      return this.equals((HqlResultAsArrays)that);
    return false;
  }

  public boolean equals(HqlResultAsArrays that) {
    if (that == null)
      return false;

    boolean this_present_results = true && this.isSetResults();
    boolean that_present_results = true && that.isSetResults();
    if (this_present_results || that_present_results) {
      if (!(this_present_results && that_present_results))
        return false;
      if (!this.results.equals(that.results))
        return false;
    }

    boolean this_present_cells = true && this.isSetCells();
    boolean that_present_cells = true && that.isSetCells();
    if (this_present_cells || that_present_cells) {
      if (!(this_present_cells && that_present_cells))
        return false;
      if (!this.cells.equals(that.cells))
        return false;
    }

    boolean this_present_scanner = true && this.isSetScanner();
    boolean that_present_scanner = true && that.isSetScanner();
    if (this_present_scanner || that_present_scanner) {
      if (!(this_present_scanner && that_present_scanner))
        return false;
      if (this.scanner != that.scanner)
        return false;
    }

    boolean this_present_mutator = true && this.isSetMutator();
    boolean that_present_mutator = true && that.isSetMutator();
    if (this_present_mutator || that_present_mutator) {
      if (!(this_present_mutator && that_present_mutator))
        return false;
      if (this.mutator != that.mutator)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(HqlResultAsArrays other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HqlResultAsArrays typedOther = (HqlResultAsArrays)other;

    lastComparison = Boolean.valueOf(isSetResults()).compareTo(typedOther.isSetResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.results, typedOther.results);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCells()).compareTo(typedOther.isSetCells());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCells()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cells, typedOther.cells);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScanner()).compareTo(typedOther.isSetScanner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScanner()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scanner, typedOther.scanner);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMutator()).compareTo(typedOther.isSetMutator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMutator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mutator, typedOther.mutator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HqlResultAsArrays(");
    boolean first = true;

    if (isSetResults()) {
      sb.append("results:");
      if (this.results == null) {
        sb.append("null");
      } else {
        sb.append(this.results);
      }
      first = false;
    }
    if (isSetCells()) {
      if (!first) sb.append(", ");
      sb.append("cells:");
      if (this.cells == null) {
        sb.append("null");
      } else {
        sb.append(this.cells);
      }
      first = false;
    }
    if (isSetScanner()) {
      if (!first) sb.append(", ");
      sb.append("scanner:");
      sb.append(this.scanner);
      first = false;
    }
    if (isSetMutator()) {
      if (!first) sb.append(", ");
      sb.append("mutator:");
      sb.append(this.mutator);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HqlResultAsArraysStandardSchemeFactory implements SchemeFactory {
    public HqlResultAsArraysStandardScheme getScheme() {
      return new HqlResultAsArraysStandardScheme();
    }
  }

  private static class HqlResultAsArraysStandardScheme extends StandardScheme<HqlResultAsArrays> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HqlResultAsArrays struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.results = new ArrayList<String>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  String _elem42; // required
                  _elem42 = iprot.readString();
                  struct.results.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setResultsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CELLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list43 = iprot.readListBegin();
                struct.cells = new ArrayList<List<String>>(_list43.size);
                for (int _i44 = 0; _i44 < _list43.size; ++_i44)
                {
                  List<String> _elem45; // required
                  {
                    org.apache.thrift.protocol.TList _list46 = iprot.readListBegin();
                    _elem45 = new ArrayList<String>(_list46.size);
                    for (int _i47 = 0; _i47 < _list46.size; ++_i47)
                    {
                      String _elem48; // required
                      _elem48 = iprot.readString();
                      _elem45.add(_elem48);
                    }
                    iprot.readListEnd();
                  }
                  struct.cells.add(_elem45);
                }
                iprot.readListEnd();
              }
              struct.setCellsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SCANNER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.scanner = iprot.readI64();
              struct.setScannerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MUTATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.mutator = iprot.readI64();
              struct.setMutatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HqlResultAsArrays struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.results != null) {
        if (struct.isSetResults()) {
          oprot.writeFieldBegin(RESULTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.results.size()));
            for (String _iter49 : struct.results)
            {
              oprot.writeString(_iter49);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.cells != null) {
        if (struct.isSetCells()) {
          oprot.writeFieldBegin(CELLS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.cells.size()));
            for (List<String> _iter50 : struct.cells)
            {
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter50.size()));
                for (String _iter51 : _iter50)
                {
                  oprot.writeString(_iter51);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetScanner()) {
        oprot.writeFieldBegin(SCANNER_FIELD_DESC);
        oprot.writeI64(struct.scanner);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMutator()) {
        oprot.writeFieldBegin(MUTATOR_FIELD_DESC);
        oprot.writeI64(struct.mutator);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HqlResultAsArraysTupleSchemeFactory implements SchemeFactory {
    public HqlResultAsArraysTupleScheme getScheme() {
      return new HqlResultAsArraysTupleScheme();
    }
  }

  private static class HqlResultAsArraysTupleScheme extends TupleScheme<HqlResultAsArrays> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HqlResultAsArrays struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResults()) {
        optionals.set(0);
      }
      if (struct.isSetCells()) {
        optionals.set(1);
      }
      if (struct.isSetScanner()) {
        optionals.set(2);
      }
      if (struct.isSetMutator()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetResults()) {
        {
          oprot.writeI32(struct.results.size());
          for (String _iter52 : struct.results)
          {
            oprot.writeString(_iter52);
          }
        }
      }
      if (struct.isSetCells()) {
        {
          oprot.writeI32(struct.cells.size());
          for (List<String> _iter53 : struct.cells)
          {
            {
              oprot.writeI32(_iter53.size());
              for (String _iter54 : _iter53)
              {
                oprot.writeString(_iter54);
              }
            }
          }
        }
      }
      if (struct.isSetScanner()) {
        oprot.writeI64(struct.scanner);
      }
      if (struct.isSetMutator()) {
        oprot.writeI64(struct.mutator);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HqlResultAsArrays struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list55 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.results = new ArrayList<String>(_list55.size);
          for (int _i56 = 0; _i56 < _list55.size; ++_i56)
          {
            String _elem57; // required
            _elem57 = iprot.readString();
            struct.results.add(_elem57);
          }
        }
        struct.setResultsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list58 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.cells = new ArrayList<List<String>>(_list58.size);
          for (int _i59 = 0; _i59 < _list58.size; ++_i59)
          {
            List<String> _elem60; // required
            {
              org.apache.thrift.protocol.TList _list61 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _elem60 = new ArrayList<String>(_list61.size);
              for (int _i62 = 0; _i62 < _list61.size; ++_i62)
              {
                String _elem63; // required
                _elem63 = iprot.readString();
                _elem60.add(_elem63);
              }
            }
            struct.cells.add(_elem60);
          }
        }
        struct.setCellsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.scanner = iprot.readI64();
        struct.setScannerIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mutator = iprot.readI64();
        struct.setMutatorIsSet(true);
      }
    }
  }

}

