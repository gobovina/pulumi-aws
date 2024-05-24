// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codegurureviewer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs;
import com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationState;
import com.pulumi.aws.codegurureviewer.outputs.RepositoryAssociationKmsKeyDetails;
import com.pulumi.aws.codegurureviewer.outputs.RepositoryAssociationRepository;
import com.pulumi.aws.codegurureviewer.outputs.RepositoryAssociationS3RepositoryDetail;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS CodeGuru Reviewer Repository Association.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.codecommit.Repository;
 * import com.pulumi.aws.codecommit.RepositoryArgs;
 * import com.pulumi.aws.codegurureviewer.RepositoryAssociation;
 * import com.pulumi.aws.codegurureviewer.RepositoryAssociationArgs;
 * import com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryArgs;
 * import com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationRepositoryCodecommitArgs;
 * import com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationKmsKeyDetailsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Key("example");
 * 
 *         var exampleRepository = new Repository("exampleRepository", RepositoryArgs.builder()
 *             .repositoryName("example-repo")
 *             .build());
 * 
 *         var exampleRepositoryAssociation = new RepositoryAssociation("exampleRepositoryAssociation", RepositoryAssociationArgs.builder()
 *             .repository(RepositoryAssociationRepositoryArgs.builder()
 *                 .codecommit(RepositoryAssociationRepositoryCodecommitArgs.builder()
 *                     .name(exampleRepository.repositoryName())
 *                     .build())
 *                 .build())
 *             .kmsKeyDetails(RepositoryAssociationKmsKeyDetailsArgs.builder()
 *                 .encryptionOption("CUSTOMER_MANAGED_CMK")
 *                 .kmsKeyId(example.keyId())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:codegurureviewer/repositoryAssociation:RepositoryAssociation")
public class RepositoryAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) identifying the repository association.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) identifying the repository association.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the repository association.
     * 
     */
    @Export(name="associationId", refs={String.class}, tree="[0]")
    private Output<String> associationId;

    /**
     * @return The ID of the repository association.
     * 
     */
    public Output<String> associationId() {
        return this.associationId;
    }
    /**
     * The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    @Export(name="connectionArn", refs={String.class}, tree="[0]")
    private Output<String> connectionArn;

    /**
     * @return The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection.
     * 
     */
    public Output<String> connectionArn() {
        return this.connectionArn;
    }
    /**
     * An object describing the KMS key to asssociate. Block is documented below.
     * 
     */
    @Export(name="kmsKeyDetails", refs={RepositoryAssociationKmsKeyDetails.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryAssociationKmsKeyDetails> kmsKeyDetails;

    /**
     * @return An object describing the KMS key to asssociate. Block is documented below.
     * 
     */
    public Output<Optional<RepositoryAssociationKmsKeyDetails>> kmsKeyDetails() {
        return Codegen.optional(this.kmsKeyDetails);
    }
    /**
     * The name of the repository.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the repository.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The owner of the repository.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return The owner of the repository.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The provider type of the repository association.
     * 
     */
    @Export(name="providerType", refs={String.class}, tree="[0]")
    private Output<String> providerType;

    /**
     * @return The provider type of the repository association.
     * 
     */
    public Output<String> providerType() {
        return this.providerType;
    }
    /**
     * An object describing the repository to associate. Valid values: `bitbucket`, `codecommit`, `github_enterprise_server`, or `s3_bucket`. Block is documented below. Note: for repositories that leverage CodeStar connections (ex. `bitbucket`, `github_enterprise_server`) the connection must be in `Available` status prior to creating this resource.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="repository", refs={RepositoryAssociationRepository.class}, tree="[0]")
    private Output<RepositoryAssociationRepository> repository;

    /**
     * @return An object describing the repository to associate. Valid values: `bitbucket`, `codecommit`, `github_enterprise_server`, or `s3_bucket`. Block is documented below. Note: for repositories that leverage CodeStar connections (ex. `bitbucket`, `github_enterprise_server`) the connection must be in `Available` status prior to creating this resource.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<RepositoryAssociationRepository> repository() {
        return this.repository;
    }
    @Export(name="s3RepositoryDetails", refs={List.class,RepositoryAssociationS3RepositoryDetail.class}, tree="[0,1]")
    private Output<List<RepositoryAssociationS3RepositoryDetail>> s3RepositoryDetails;

    public Output<List<RepositoryAssociationS3RepositoryDetail>> s3RepositoryDetails() {
        return this.s3RepositoryDetails;
    }
    /**
     * The state of the repository association.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the repository association.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A description of why the repository association is in the current state.
     * 
     */
    @Export(name="stateReason", refs={String.class}, tree="[0]")
    private Output<String> stateReason;

    /**
     * @return A description of why the repository association is in the current state.
     * 
     */
    public Output<String> stateReason() {
        return this.stateReason;
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RepositoryAssociation(String name) {
        this(name, RepositoryAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RepositoryAssociation(String name, RepositoryAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RepositoryAssociation(String name, RepositoryAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codegurureviewer/repositoryAssociation:RepositoryAssociation", name, args == null ? RepositoryAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RepositoryAssociation(String name, Output<String> id, @Nullable RepositoryAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codegurureviewer/repositoryAssociation:RepositoryAssociation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RepositoryAssociation get(String name, Output<String> id, @Nullable RepositoryAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RepositoryAssociation(name, id, state, options);
    }
}
