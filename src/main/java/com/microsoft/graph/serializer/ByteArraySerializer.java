// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.serializer;

import com.google.common.io.BaseEncoding;

import java.text.ParseException;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * Serializer for byte[]s
 */
public final class ByteArraySerializer {

    /**
     * Not available for instantiation
     */
    private ByteArraySerializer() {
    }

    /**
     * Deserializes a string
     * 
     * @param strVal          the value to deserialize
     * @return                the string encoded bytes
     * @throws ParseException if there is any problem processing the value
     */
    @Nullable
    public static byte[] deserialize(@Nonnull final String strVal) throws ParseException {
    	return BaseEncoding.base64().decode(strVal);
    }

    /**
     * Serializes the string
     *
     * @param src the source array
     * @return    the string
     */
    @Nullable
    public static String serialize(@Nonnull final byte[] src) {
        return BaseEncoding.base64().encode(src);
    }
}
