// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCellsFilterTableDataColumnWildcardArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCellsFilterTableDataColumnWildcardArgs Empty = new DataCellsFilterTableDataColumnWildcardArgs();

    /**
     * (Optional) Excludes column names. Any column with this name will be excluded.
     * 
     */
    @Import(name="excludedColumnNames")
    private @Nullable Output<List<String>> excludedColumnNames;

    /**
     * @return (Optional) Excludes column names. Any column with this name will be excluded.
     * 
     */
    public Optional<Output<List<String>>> excludedColumnNames() {
        return Optional.ofNullable(this.excludedColumnNames);
    }

    private DataCellsFilterTableDataColumnWildcardArgs() {}

    private DataCellsFilterTableDataColumnWildcardArgs(DataCellsFilterTableDataColumnWildcardArgs $) {
        this.excludedColumnNames = $.excludedColumnNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCellsFilterTableDataColumnWildcardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCellsFilterTableDataColumnWildcardArgs $;

        public Builder() {
            $ = new DataCellsFilterTableDataColumnWildcardArgs();
        }

        public Builder(DataCellsFilterTableDataColumnWildcardArgs defaults) {
            $ = new DataCellsFilterTableDataColumnWildcardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludedColumnNames (Optional) Excludes column names. Any column with this name will be excluded.
         * 
         * @return builder
         * 
         */
        public Builder excludedColumnNames(@Nullable Output<List<String>> excludedColumnNames) {
            $.excludedColumnNames = excludedColumnNames;
            return this;
        }

        /**
         * @param excludedColumnNames (Optional) Excludes column names. Any column with this name will be excluded.
         * 
         * @return builder
         * 
         */
        public Builder excludedColumnNames(List<String> excludedColumnNames) {
            return excludedColumnNames(Output.of(excludedColumnNames));
        }

        /**
         * @param excludedColumnNames (Optional) Excludes column names. Any column with this name will be excluded.
         * 
         * @return builder
         * 
         */
        public Builder excludedColumnNames(String... excludedColumnNames) {
            return excludedColumnNames(List.of(excludedColumnNames));
        }

        public DataCellsFilterTableDataColumnWildcardArgs build() {
            return $;
        }
    }

}
