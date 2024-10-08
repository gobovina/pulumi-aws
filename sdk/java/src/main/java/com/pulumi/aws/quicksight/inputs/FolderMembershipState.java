// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderMembershipState extends com.pulumi.resources.ResourceArgs {

    public static final FolderMembershipState Empty = new FolderMembershipState();

    /**
     * AWS account ID.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * Identifier for the folder.
     * 
     */
    @Import(name="folderId")
    private @Nullable Output<String> folderId;

    /**
     * @return Identifier for the folder.
     * 
     */
    public Optional<Output<String>> folderId() {
        return Optional.ofNullable(this.folderId);
    }

    /**
     * ID of the asset (the dashboard, analysis, or dataset).
     * 
     */
    @Import(name="memberId")
    private @Nullable Output<String> memberId;

    /**
     * @return ID of the asset (the dashboard, analysis, or dataset).
     * 
     */
    public Optional<Output<String>> memberId() {
        return Optional.ofNullable(this.memberId);
    }

    /**
     * Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="memberType")
    private @Nullable Output<String> memberType;

    /**
     * @return Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<String>> memberType() {
        return Optional.ofNullable(this.memberType);
    }

    private FolderMembershipState() {}

    private FolderMembershipState(FolderMembershipState $) {
        this.awsAccountId = $.awsAccountId;
        this.folderId = $.folderId;
        this.memberId = $.memberId;
        this.memberType = $.memberType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderMembershipState $;

        public Builder() {
            $ = new FolderMembershipState();
        }

        public Builder(FolderMembershipState defaults) {
            $ = new FolderMembershipState(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param folderId Identifier for the folder.
         * 
         * @return builder
         * 
         */
        public Builder folderId(@Nullable Output<String> folderId) {
            $.folderId = folderId;
            return this;
        }

        /**
         * @param folderId Identifier for the folder.
         * 
         * @return builder
         * 
         */
        public Builder folderId(String folderId) {
            return folderId(Output.of(folderId));
        }

        /**
         * @param memberId ID of the asset (the dashboard, analysis, or dataset).
         * 
         * @return builder
         * 
         */
        public Builder memberId(@Nullable Output<String> memberId) {
            $.memberId = memberId;
            return this;
        }

        /**
         * @param memberId ID of the asset (the dashboard, analysis, or dataset).
         * 
         * @return builder
         * 
         */
        public Builder memberId(String memberId) {
            return memberId(Output.of(memberId));
        }

        /**
         * @param memberType Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder memberType(@Nullable Output<String> memberType) {
            $.memberType = memberType;
            return this;
        }

        /**
         * @param memberType Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder memberType(String memberType) {
            return memberType(Output.of(memberType));
        }

        public FolderMembershipState build() {
            return $;
        }
    }

}
