package dev.langchain4j.langsmith.gen;

import java.util.Arrays;
import java.util.List;

public class CollectionFormats {

    public static class CSVParams {

        protected List<String> params;

        public CSVParams() {
        }

        public CSVParams(List<String> params) {
            this.params = params;
        }

        public CSVParams(String... params) {
            this.params = Arrays.asList(params);
        }

        public List<String> getParams() {
            return params;
        }

        public void setParams(List<String> params) {
            this.params = params;
        }

        @Override
        public String toString() {
            return StringUtil.join(params.toArray(new String[0]), ",");
        }

    }

    public static class SPACEParams extends SSVParams {

    }

    public static class SSVParams extends CSVParams {

        public SSVParams() {
        }

        public SSVParams(List<String> params) {
            super(params);
        }

        public SSVParams(String... params) {
            super(params);
        }

        @Override
        public String toString() {
            return StringUtil.join(params.toArray(new String[0]), " ");
        }
    }

    public static class TSVParams extends CSVParams {

        public TSVParams() {
        }

        public TSVParams(List<String> params) {
            super(params);
        }

        public TSVParams(String... params) {
            super(params);
        }

        @Override
        public String toString() {
            return StringUtil.join( params.toArray(new String[0]), "\t");
        }
    }

    public static class PIPESParams extends CSVParams {

        public PIPESParams() {
        }

        public PIPESParams(List<String> params) {
            super(params);
        }

        public PIPESParams(String... params) {
            super(params);
        }

        @Override
        public String toString() {
            return StringUtil.join(params.toArray(new String[0]), "|");
        }
    }

}
