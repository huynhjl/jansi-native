/**
 * Copyright (C) 2009, Progress Software Corporation and/or its 
 * subsidiaries or affiliates.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.jansi.internal;

import org.fusesource.hawtjni.runtime.ClassFlag;
import org.fusesource.hawtjni.runtime.JniArg;
import org.fusesource.hawtjni.runtime.JniClass;
import org.fusesource.hawtjni.runtime.JniField;
import org.fusesource.hawtjni.runtime.JniMethod;
import org.fusesource.hawtjni.runtime.Library;

import static org.fusesource.hawtjni.runtime.ArgFlag.*;
import static org.fusesource.hawtjni.runtime.ClassFlag.*;
import static org.fusesource.hawtjni.runtime.FieldFlag.*;
import static org.fusesource.hawtjni.runtime.MethodFlag.*;

/**
 * 
 * @author <a href="http://hiramchirino.com">Hiram Chirino</a>
 */
@JniClass(conditional="defined(_WIN32) || defined(_WIN64)")
public class Kernel32 {
    
    private static final Library LIBRARY = new Library("jansi", Kernel32.class);    
	static {
        LIBRARY.load();
        init();
	}

    @JniMethod(flags={CONSTANT_INITIALIZER})
    private static final native void init();

    @JniField(flags={CONSTANT})
    public static short FOREGROUND_BLUE;
    @JniField(flags={CONSTANT})
    public static short FOREGROUND_GREEN;
    @JniField(flags={CONSTANT})
    public static short FOREGROUND_RED;
    @JniField(flags={CONSTANT})
    public static short FOREGROUND_INTENSITY;
    @JniField(flags={CONSTANT})
    public static short BACKGROUND_BLUE;
    @JniField(flags={CONSTANT})
    public static short BACKGROUND_GREEN;
    @JniField(flags={CONSTANT})
    public static short BACKGROUND_RED;
    @JniField(flags={CONSTANT})
    public static short BACKGROUND_INTENSITY;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_LEADING_BYTE;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_TRAILING_BYTE;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_GRID_HORIZONTAL;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_GRID_LVERTICAL;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_GRID_RVERTICAL;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_REVERSE_VIDEO;
    @JniField(flags={CONSTANT})
    public static short COMMON_LVB_UNDERSCORE;    
    @JniField(flags={CONSTANT})
    public static int FORMAT_MESSAGE_FROM_SYSTEM;
    @JniField(flags={CONSTANT})
    public static int STD_INPUT_HANDLE;
    @JniField(flags={CONSTANT})
    public static int STD_OUTPUT_HANDLE;
    @JniField(flags={CONSTANT})
    public static int STD_ERROR_HANDLE;
    @JniField(flags={CONSTANT})
    public static int INVALID_HANDLE_VALUE;
    

    @JniMethod(cast="void *")
    public static final native long malloc(
            @JniArg(cast="size_t") long size);

    public static final native void free(
            @JniArg(cast="void *") long ptr);

//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}) byte[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}) char[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL})  short[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL})  int[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}, pointer=FALSE) long[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}) float[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}) double[] src, 
//            @JniArg(cast="size_t") long size);
//
//    
//    
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) byte[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) char[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) short[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) int[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}, pointer=FALSE) long[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//    
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) float[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) double[] dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) byte[] dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL})  char[] src, 
//            @JniArg(cast="size_t") long size);
//
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) int[] dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}) byte[] src, 
//            @JniArg(cast="size_t") long size);
//
//    @JniMethod(cast="void *")
//    public static final native long memset (
//            @JniArg(cast="void *") long buffer, 
//            int c, 
//            @JniArg(cast="size_t") long num);
//    
//    public static final native int strlen(
//            @JniArg(cast="char *")long s);
//    
//    public static final native void memmove (
//            @JniArg(cast="void *") long dest, 
//            @JniArg(cast="const void *", flags={NO_OUT, CRITICAL}) foo src, 
//            @JniArg(cast="size_t") long size);
//    
//    public static final native void memmove (
//            @JniArg(cast="void *", flags={NO_IN, CRITICAL}) foo dest, 
//            @JniArg(cast="const void *") long src, 
//            @JniArg(cast="size_t") long size);
    
    /**
     * http://msdn.microsoft.com/en-us/library/ms686311%28VS.85%29.aspx
     */
    @JniClass(flags={STRUCT,TYPEDEF}, conditional="defined(_WIN32) || defined(_WIN64)")
    static public class SMALL_RECT {
        static {
            LIBRARY.load();
            init();
        }
        
        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static final native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(SMALL_RECT)")
        public static int SIZEOF;

        @JniField(accessor="Left")
        public short left;
        @JniField(accessor="Top")
        public short top;
        @JniField(accessor="Right")
        public short right;
        @JniField(accessor="Bottom")
        public short bottom;
        
        public short width() {
            return (short) (right-left);
        }
        public short height() {
            return (short) (bottom-top);
        }
    }    

    /**
     * see http://msdn.microsoft.com/en-us/library/ms686047%28VS.85%29.aspx
     * @param consoleOutput
     * @param attributes
     * @return
     */
    public static final native int SetConsoleTextAttribute(
            @JniArg(cast="HANDLE")long consoleOutput, 
            short attributes);

    @JniClass(flags={ClassFlag.STRUCT,TYPEDEF}, conditional="defined(_WIN32) || defined(_WIN64)")
    public static class COORD {

        static {
            LIBRARY.load();
            init();
        }
        
        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static final native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(COORD)")
        public static int SIZEOF;

        @JniField(accessor="X")
        public short x;
        @JniField(accessor="Y")
        public short y;
        
        public COORD copy() {
        	COORD rc = new COORD();
        	rc.x = x;
        	rc.y = y;
        	return rc;
        }
    }
    
    /**
     * http://msdn.microsoft.com/en-us/library/ms682093%28VS.85%29.aspx
     */
    @JniClass(flags={ClassFlag.STRUCT,TYPEDEF}, conditional="defined(_WIN32) || defined(_WIN64)")
    public static class CONSOLE_SCREEN_BUFFER_INFO { 
        
        static {
            LIBRARY.load();
            init();
        }
        
        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static final native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(CONSOLE_SCREEN_BUFFER_INFO)")
        public static int SIZEOF;

        @JniField(accessor="dwSize")
        public COORD      size = new COORD();
        @JniField(accessor="dwCursorPosition")
        public COORD      cursorPosition = new COORD();
        @JniField(accessor="wAttributes")
        public short      attributes;
        @JniField(accessor="srWindow")
        public SMALL_RECT window = new SMALL_RECT();
        @JniField(accessor="dwMaximumWindowSize")
        public COORD      maximumWindowSize = new COORD();
        
        public int windowWidth() {
            return window.width() + 1;
        }
        
        public int windowHeight() {
            return window.height() + 1;
        }
    }
    
    
    /**
     * see: http://msdn.microsoft.com/en-us/library/ms724211%28VS.85%29.aspx
     * 
     * @param handle
     * @return
     */
    public static final native int CloseHandle(@JniArg(cast="HANDLE")long handle);

    
    /**
     * see: http://msdn.microsoft.com/en-us/library/ms679360(VS.85).aspx
     * 
     * @param handle
     * @return
     */
    public static final native int GetLastError();

    /**
     * 
     * @param flags
     * @param source
     * @param messageId
     * @param languageId
     * @param buffer
     * @param size
     * @param arguments
     * @return
     */
    public static final native int FormatMessageW(
            int flags, 
            @JniArg(cast="void *")long  source, 
            int messageId,
            int languageId, 
            @JniArg(cast="void *", flags={NO_IN, CRITICAL})byte[] buffer, 
            int size,
            @JniArg(cast="void *", flags={NO_IN, CRITICAL, SENTINEL})long []args
            );
    
    
    /**
     * See: http://msdn.microsoft.com/en-us/library/ms683171%28VS.85%29.aspx
     * @param consoleOutput
     * @param consoleScreenBufferInfo
     * @return
     */
    public static final native int GetConsoleScreenBufferInfo(
            @JniArg(cast="HANDLE", flags={POINTER_ARG})long consoleOutput, 
            CONSOLE_SCREEN_BUFFER_INFO consoleScreenBufferInfo);
    
    /**
     * see: http://msdn.microsoft.com/en-us/library/ms683231%28VS.85%29.aspx
     * @param stdHandle
     * @return
     */
    @JniMethod(cast="HANDLE", flags={POINTER_RETURN})
    public static final native long GetStdHandle(int stdHandle);

    /**
     * http://msdn.microsoft.com/en-us/library/ms686025%28VS.85%29.aspx
     * @param consoleOutput
     * @param cursorPosition
     * @return
     */
    public static final native int SetConsoleCursorPosition(
            @JniArg(cast="HANDLE", flags={POINTER_ARG})long consoleOutput, 
            @JniArg(flags={BY_VALUE}) COORD cursorPosition);

    /**
     * see: http://msdn.microsoft.com/en-us/library/ms682663%28VS.85%29.aspx
     * 
     * @param consoleOutput
     * @param character
     * @param length
     * @param dwWriteCoord
     * @param numberOfCharsWritten
     * @return
     */
    public static final native int FillConsoleOutputCharacterW(
            @JniArg(cast="HANDLE", flags={POINTER_ARG}) long consoleOutput, 
            char character, 
            int length, 
            @JniArg(flags={BY_VALUE}) COORD writeCoord, 
            int[] numberOfCharsWritten);
 
   
    /**
     * see: http://msdn.microsoft.com/en-us/library/ms683167%28VS.85%29.aspx
     * @param handle
     * @param mode
     * @return
     */
    public static final native int GetConsoleMode(
            @JniArg(cast="HANDLE", flags={POINTER_ARG}) long handle, 
            int[] mode);
    
    /**
     * see: http://msdn.microsoft.com/en-us/library/ms686033%28VS.85%29.aspx
     * @param handle
     * @param mode
     * @return
     */
    public static final native int SetConsoleMode(
            @JniArg(cast="HANDLE", flags={POINTER_ARG}) long handle, 
            int mode);

    /**
     * see: http://msdn.microsoft.com/en-us/library/078sfkak(VS.80).aspx
     * @return
     */
    public static final native int _getch();
    

   /**
    * see: http://msdn.microsoft.com/en-us/library/ms686050%28VS.85%29.aspx
    * @param title
    * @return 0 if title was set successfully
    */
   public static final native int SetConsoleTitle(
               @JniArg(flags={UNICODE}) String title);    

    /**
     * see: http://msdn.microsoft.com/en-us/library/ms684166(v=VS.85).aspx
     */
    @JniClass(flags={ClassFlag.STRUCT,TYPEDEF}, conditional="defined(_WIN32) || defined(_WIN64)")
    public static class KEY_EVENT_RECORD {

        static {
            LIBRARY.load();
            init();
        }

        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static final native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(KEY_EVENT_RECORD)")
        public static int SIZEOF;
        @JniField(flags={CONSTANT}, accessor="CAPSLOCK_ON")
        public static int CAPSLOCK_ON;
        @JniField(flags={CONSTANT}, accessor="NUMLOCK_ON")
        public static int NUMLOCK_ON;
        @JniField(flags={CONSTANT}, accessor="SCROLLLOCK_ON")
        public static int SCROLLLOCK_ON;
        @JniField(flags={CONSTANT}, accessor="ENHANCED_KEY")
        public static int ENHANCED_KEY;
        @JniField(flags={CONSTANT}, accessor="LEFT_ALT_PRESSED")
        public static int LEFT_ALT_PRESSED;
        @JniField(flags={CONSTANT}, accessor="LEFT_CTRL_PRESSED")
        public static int LEFT_CTRL_PRESSED;
        @JniField(flags={CONSTANT}, accessor="RIGHT_ALT_PRESSED")
        public static int RIGHT_ALT_PRESSED;
        @JniField(flags={CONSTANT}, accessor="RIGHT_CTRL_PRESSED")
        public static int RIGHT_CTRL_PRESSED;
        @JniField(flags={CONSTANT}, accessor="SHIFT_PRESSED")
        public static int SHIFT_PRESSED;

        @JniField(accessor="bKeyDown")
        public boolean keyDown;
        @JniField(accessor="wRepeatCount")
        public short repeatCount;
        @JniField(accessor="wVirtualKeyCode")
        public short keyCode;
        @JniField(accessor="wVirtualScanCode")
        public short scanCode;
        @JniField(accessor="uChar.UnicodeChar")
        public char uchar;
        @JniField(accessor="dwControlKeyState")
        public int controlKeyState;

        public String toString() {
            return "KEY_EVENT_RECORD{" +
                    "keyDown=" + keyDown +
                    ", repeatCount=" + repeatCount +
                    ", keyCode=" + keyCode +
                    ", scanCode=" + scanCode +
                    ", uchar=" + uchar +
                    ", controlKeyState=" + controlKeyState +
                    '}';
        }
    }

    /**
     * see: http://msdn.microsoft.com/en-us/library/ms683499(v=VS.85).aspx
     */
    @JniClass(flags={ClassFlag.STRUCT,TYPEDEF}, conditional="defined(_WIN32) || defined(_WIN64)")
    public static class INPUT_RECORD {

        static {
            LIBRARY.load();
            init();
        }

        @JniMethod(flags={CONSTANT_INITIALIZER})
        private static final native void init();
        @JniField(flags={CONSTANT}, accessor="sizeof(INPUT_RECORD)")
        public static int SIZEOF;
        @JniField(flags={CONSTANT}, accessor="KEY_EVENT")
        public static short KEY_EVENT;

        @JniField(accessor="EventType")
        public short eventType;
        @JniField(accessor="Event.KeyEvent")
        public KEY_EVENT_RECORD keyEvent = new KEY_EVENT_RECORD();
    }

    /**
     * see: http://msdn.microsoft.com/en-us/library/ms684961(v=VS.85).aspx
     * @param handle
     * @param length must be exactly 1
     * @param eventsCount
     * @return
     */
    private static final native int ReadConsoleInputW(
            @JniArg(cast="HANDLE", flags={POINTER_ARG}) long handle,
            INPUT_RECORD inputRecord,
            int length, // must be one
            int[] eventsCount);

    /**
     * Return a key event record (discard other events until a key event is
     * found)
     * @param handle
     * @return null on read errors
     */
    public static KEY_EVENT_RECORD readKeyEvent(
            long handle) {
        int[] count = new int[1];
        INPUT_RECORD inputRecord = new INPUT_RECORD();
        int loop = 0; // give up after some arbitrary threshold
        int res;
        while (loop < 1000) {
            res = ReadConsoleInputW(handle, inputRecord, 1, count);
            if (res != 0 && count[0] == 1) {
                if (inputRecord.eventType == INPUT_RECORD.KEY_EVENT) {
                    return inputRecord.keyEvent;
                }
            } else {
                return null;
            }
            loop++;
        }
        return null;
    }
}
