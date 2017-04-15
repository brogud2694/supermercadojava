package Data;
/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net
*/

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Strings
{
  private static final MessageDigest MESSAGE_DIGEST;
  public static final String[] EMPTY_ARRAY = new String[0];

  static {
      MessageDigest md;
      try {
          md = MessageDigest.getInstance("MD5");
      } catch(NoSuchAlgorithmException err) {
        throw new IllegalStateException();
      }
      MESSAGE_DIGEST = md;
  }
  private static final String HEX_CHARS = "0123456789ABCDEF";
  
  public static String getMD5(String source) {    
      byte[] bytes;
      try {
        bytes = source.getBytes("UTF-8");
      } catch(java.io.UnsupportedEncodingException ue) {
        throw new IllegalStateException(ue);
      }
      byte[] result;
      synchronized(MESSAGE_DIGEST) {
          MESSAGE_DIGEST.update(bytes);
          result = MESSAGE_DIGEST.digest();
      }
      char[] resChars = new char[32];
      int len = result.length;
      for(int i = 0; i < len; i++) {
          byte b = result[i];
          int lo4 = b & 0x0F;
          int hi4 = (b & 0xF0) >> 4;
          resChars[i*2] = HEX_CHARS.charAt(hi4);
          resChars[i*2 + 1] = HEX_CHARS.charAt(lo4);
      }
      return new String(resChars);
  }
  
  public static String getHash32(String source) throws UnsupportedEncodingException {
      String md5 = getMD5(source);
      return md5.substring(0, 8);
  }      

  public static String getHash64(String source) throws UnsupportedEncodingException {
      String md5 = getHash64(source);
      return md5.substring(0, 16);
  }   
  
}
