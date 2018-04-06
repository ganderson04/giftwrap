import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;

import java.io.Serializable;

/**
 * This class simplifies the process of adding items to a Bundle.
 */
public class Giftwrap {
    private Bundle bundle = new Bundle();

    /**
     * Handles the addition of items to the Bundle.
     * @param key   the identifier for the object within the Bundle.
     * @param obj   the object to add to the Bundle.
     * @return  this Giftwrap instance to allow method chaining for multiple additions to the
     * Bundle.
     */
    public Giftwrap put(String key, Object obj){

        // Arrays are handled first.
        if(obj.getClass().isArray()) {
            Class type = obj.getClass().getComponentType();

            if(type.equals(Boolean.class)){
                Boolean[] from = (Boolean[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                boolean[] to = new boolean[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putBooleanArray(key, to);
            }
            else if(type.equals(boolean.class)){
                bundle.putBooleanArray(key, (boolean[]) obj);
            }
            else if(type.equals(Byte.class)){
                Byte[] from = (Byte[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                byte[] to = new byte[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putByteArray(key, to);
            }
            else if(type.equals(byte.class)){
                bundle.putByteArray(key, (byte[]) obj);
            }
            else if(type.equals(Character.class)){
                Character[] from = (Character[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                char[] to = new char[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putCharArray(key, to);
            }
            else if(type.equals(char.class)){
                bundle.putCharArray(key, (char[]) obj);
            }
            else if(type.equals(CharSequence.class)){
                bundle.putCharSequenceArray(key, (CharSequence[]) obj);
            }
            else if(type.equals(Double.class)){
                Double[] from = (Double[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                double[] to = new double[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putDoubleArray(key, to);
            }
            else if(type.equals(double.class)){
                bundle.putDoubleArray(key, (double[]) obj);
            }
            else if(type.equals(Float.class)){
                Float[] from = (Float[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                float[] to = new float[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putFloatArray(key, to);
            }
            else if(type.equals(float.class)){
                bundle.putFloatArray(key, (float[]) obj);
            }
            else if(type.equals(Integer.class)){
                Integer[] from = (Integer[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                int[] to = new int[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putIntArray(key, to);
            }
            else if(type.equals(int.class)){
                bundle.putIntArray(key, (int[]) obj);
            }
            else if(type.equals(Long.class)){
                Long[] from = (Long[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                long[] to = new long[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putLongArray(key, to);
            }
            else if(type.equals(long.class)){
                bundle.putLongArray(key, (long[]) obj);
            }
            else if(type.equals(Parcelable.class)){
                bundle.putParcelableArray(key, (Parcelable[]) obj);
            }
            else if(type.equals(Short.class)){
                Short[] from = (Short[]) obj;
                int size = 0;
                for (int i = 0; i < from.length; i++) {
                    if(from[i] != null) {
                        size++;
                    }
                }

                short[] to = new short[size];
                for (int i = 0; i < size; i++) {
                    if(from[i] != null) {
                        to[i] = from[i];
                    }
                }
                bundle.putShortArray(key, to);
            }
            else if(type.equals(short.class)){
                bundle.putShortArray(key, (short[]) obj);
            }
            else if(type.equals(String.class)){
                bundle.putStringArray(key, (String[]) obj);
            }
        }

        // Then everything else.
        else {
            if (obj instanceof IBinder) {
                bundle.putBinder(key, (IBinder) obj);
            }
            else if(obj instanceof Boolean){
                bundle.putBoolean(key, (boolean) obj);
            }
            else if (obj instanceof Byte) {
                bundle.putByte(key, (byte) obj);
            }
            else if (obj instanceof Character) {
                bundle.putChar(key, (char) obj);
            }
            else if(obj instanceof Double){
                bundle.putDouble(key, (double) obj);
            }
            else if (obj instanceof String) {
                bundle.putString(key, (String) obj);
            }
            else if (obj instanceof CharSequence) {
                bundle.putCharSequence(key, (CharSequence) obj);
            }
            else if (obj instanceof Float) {
                bundle.putFloat(key, (float) obj);
            }
            else if(obj instanceof Integer){
                bundle.putInt(key, (int) obj);
            }
            else if(obj instanceof Long){
                bundle.putLong(key, (long) obj);
            }
            else if (obj instanceof Short) {
                bundle.putShort(key, (short) obj);
            }
            else if (obj instanceof Size) {
                bundle.putSize(key, (Size) obj);
            }
            else if (obj instanceof SizeF) {
                bundle.putSizeF(key, (SizeF) obj);
            }
            else if(obj instanceof SparseArray<?>){
                if(obj.getClass().isAssignableFrom(Parcelable.class)){
                    bundle.putSparseParcelableArray(key, (SparseArray<? extends Parcelable>) obj);
                }
            }
            else if (obj instanceof Parcelable) {
                bundle.putParcelable(key, (Parcelable) obj);
            }
            // This will catch ArrayLists also.
            else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }

        return this;
    }

    /**
     * Returns the filled Bundle.
     * @return  a Bundle.
     */
    public Bundle wrap(){
        return bundle;
    }
}
