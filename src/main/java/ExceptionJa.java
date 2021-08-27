public class ExceptionJa {
    int checkedException(int x) throws Exception {
        if (x == 1) {
            throw new Exception("checked");
        }
        return x;
    }

    int tryCheckedException(int x) {
        try {
            return checkedException(x);

        } catch (Exception exn) {
            return -x;
        }
    }

    int runtimeException(int x) {
        if (x == 1) {
            throw new RuntimeException("runtime");
        }
        return x;
    }

    int tryRuntimeException(int x) {
        try {
            return runtimeException(x);
        } catch (RuntimeException exn) {
            return -x;
        }
    }

    int tryAutoCloseableWithException(int x) {
        class TestAutoCloseable implements AutoCloseable {
            int i = 0;
            @Override public void close() {
                i = -x;
            }
        }
        TestAutoCloseable outer = new TestAutoCloseable();
        try (TestAutoCloseable tac = new TestAutoCloseable()) {
            outer = tac;
            if (x == 1) {
                throw new Exception();
            }
            return x;
        } catch (Exception exn) {
            return outer.i;
        }
    }
}
