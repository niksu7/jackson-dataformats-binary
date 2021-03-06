package com.fasterxml.jackson.dataformat.avro.interop.records;

import lombok.Data;
import org.junit.Test;

import com.fasterxml.jackson.dataformat.avro.interop.InteropTestBase;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

/**
 * Tests serializing primitive fields on records
 */
public class RecordWithPrimitiveTest extends InteropTestBase {
    @Data
    public static class TestRecord {
        private byte   byteField;
        private short  shortField;
        private char   characterField;
        private int    integerField;
        private long   longField;
        private float  floatField;
        private double doubleField;
    }

    @Test
    public void testByteField() throws IOException {
        TestRecord record = new TestRecord();
        record.byteField = Byte.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.byteField).isEqualTo(record.byteField);
    }

    @Test
    public void testCharacterField() throws IOException {
        TestRecord record = new TestRecord();
        record.characterField = Character.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.characterField).isEqualTo(record.characterField);
    }

    @Test
    public void testDoubleField() throws IOException {
        TestRecord record = new TestRecord();
        record.doubleField = Double.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.doubleField).isEqualTo(record.doubleField);
    }

    @Test
    public void testFloatField() throws IOException {
        TestRecord record = new TestRecord();
        record.floatField = Float.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.floatField).isEqualTo(record.floatField);
    }

    @Test
    public void testInteger() throws IOException {
        TestRecord record = new TestRecord();
        record.integerField = Integer.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.integerField).isEqualTo(record.integerField);
    }

    @Test
    public void testLongField() throws IOException {
        TestRecord record = new TestRecord();
        record.longField = Long.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.longField).isEqualTo(record.longField);
    }

    @Test
    public void testShortField() throws IOException {
        TestRecord record = new TestRecord();
        record.shortField = Short.MAX_VALUE;
        //
        TestRecord result = roundTrip(record);
        //
        assertThat(result.shortField).isEqualTo(record.shortField);
    }
}
