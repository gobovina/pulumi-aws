// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogTableOpenTableFormatInputIcebergInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogTableOpenTableFormatInputIcebergInputArgs Empty = new CatalogTableOpenTableFormatInputIcebergInputArgs();

    /**
     * A required metadata operation. Can only be set to CREATE.
     * 
     */
    @Import(name="metadataOperation", required=true)
    private Output<String> metadataOperation;

    /**
     * @return A required metadata operation. Can only be set to CREATE.
     * 
     */
    public Output<String> metadataOperation() {
        return this.metadataOperation;
    }

    /**
     * The table version for the Iceberg table. Defaults to 2.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The table version for the Iceberg table. Defaults to 2.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private CatalogTableOpenTableFormatInputIcebergInputArgs() {}

    private CatalogTableOpenTableFormatInputIcebergInputArgs(CatalogTableOpenTableFormatInputIcebergInputArgs $) {
        this.metadataOperation = $.metadataOperation;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogTableOpenTableFormatInputIcebergInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogTableOpenTableFormatInputIcebergInputArgs $;

        public Builder() {
            $ = new CatalogTableOpenTableFormatInputIcebergInputArgs();
        }

        public Builder(CatalogTableOpenTableFormatInputIcebergInputArgs defaults) {
            $ = new CatalogTableOpenTableFormatInputIcebergInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadataOperation A required metadata operation. Can only be set to CREATE.
         * 
         * @return builder
         * 
         */
        public Builder metadataOperation(Output<String> metadataOperation) {
            $.metadataOperation = metadataOperation;
            return this;
        }

        /**
         * @param metadataOperation A required metadata operation. Can only be set to CREATE.
         * 
         * @return builder
         * 
         */
        public Builder metadataOperation(String metadataOperation) {
            return metadataOperation(Output.of(metadataOperation));
        }

        /**
         * @param version The table version for the Iceberg table. Defaults to 2.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The table version for the Iceberg table. Defaults to 2.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public CatalogTableOpenTableFormatInputIcebergInputArgs build() {
            $.metadataOperation = Objects.requireNonNull($.metadataOperation, "expected parameter 'metadataOperation' to be non-null");
            return $;
        }
    }

}
