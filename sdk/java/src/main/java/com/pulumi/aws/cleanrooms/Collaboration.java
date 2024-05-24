// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cleanrooms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cleanrooms.CollaborationArgs;
import com.pulumi.aws.cleanrooms.inputs.CollaborationState;
import com.pulumi.aws.cleanrooms.outputs.CollaborationDataEncryptionMetadata;
import com.pulumi.aws.cleanrooms.outputs.CollaborationMember;
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
 * Provides a AWS Clean Rooms collaboration.  All members included in the definition will be invited to
 * join the collaboration and can create memberships.
 * 
 * ## Example Usage
 * 
 * ### Collaboration with tags
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cleanrooms.Collaboration;
 * import com.pulumi.aws.cleanrooms.CollaborationArgs;
 * import com.pulumi.aws.cleanrooms.inputs.CollaborationDataEncryptionMetadataArgs;
 * import com.pulumi.aws.cleanrooms.inputs.CollaborationMemberArgs;
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
 *         var testCollaboration = new Collaboration("testCollaboration", CollaborationArgs.builder()
 *             .name("pulumi-example-collaboration")
 *             .creatorMemberAbilities(            
 *                 "CAN_QUERY",
 *                 "CAN_RECEIVE_RESULTS")
 *             .creatorDisplayName("Creator ")
 *             .description("I made this collaboration with Pulumi!")
 *             .queryLogStatus("DISABLED")
 *             .dataEncryptionMetadata(CollaborationDataEncryptionMetadataArgs.builder()
 *                 .allowClearText(true)
 *                 .allowDuplicates(true)
 *                 .allowJoinsOnColumnsWithDifferentNames(true)
 *                 .preserveNulls(false)
 *                 .build())
 *             .members(CollaborationMemberArgs.builder()
 *                 .accountId(123456789012)
 *                 .displayName("Other member")
 *                 .memberAbilities()
 *                 .build())
 *             .tags(Map.of("Project", "Pulumi"))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_cleanrooms_collaboration` using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cleanrooms/collaboration:Collaboration collaboration 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:cleanrooms/collaboration:Collaboration")
public class Collaboration extends com.pulumi.resources.CustomResource {
    /**
     * The arn of the collaboration.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The arn of the collaboration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date and time the collaboration was created.
     * * `member status` - For each member included in the collaboration an additional computed attribute of status is added. These values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_MemberSummary.html#API-Type-MemberSummary-status).
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The date and time the collaboration was created.
     * * `member status` - For each member included in the collaboration an additional computed attribute of status is added. These values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_MemberSummary.html#API-Type-MemberSummary-status).
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The name for the member record for the collaboration creator.
     * 
     */
    @Export(name="creatorDisplayName", refs={String.class}, tree="[0]")
    private Output<String> creatorDisplayName;

    /**
     * @return The name for the member record for the collaboration creator.
     * 
     */
    public Output<String> creatorDisplayName() {
        return this.creatorDisplayName;
    }
    /**
     * The list of member abilities for the creator of the collaboration.  Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-creatorMemberAbilities).
     * 
     */
    @Export(name="creatorMemberAbilities", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> creatorMemberAbilities;

    /**
     * @return The list of member abilities for the creator of the collaboration.  Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-creatorMemberAbilities).
     * 
     */
    public Output<List<String>> creatorMemberAbilities() {
        return this.creatorMemberAbilities;
    }
    /**
     * a collection of settings which determine how the [c3r client](https://docs.aws.amazon.com/clean-rooms/latest/userguide/crypto-computing.html) will encrypt data for use within this collaboration.
     * * `data_encryption_metadata.allow_clear_text` - (Required - Forces new resource) - Indicates whether encrypted tables can contain cleartext data. This is a boolea
     *   field.
     * * `data_encryption_metadata.allow_duplicates` - (Required - Forces new resource ) - Indicates whether Fingerprint columns can contain duplicate entries. This is a
     *   boolean field.
     * * `data_encryption_metadata.allow_joins_on_columns_with_different_names` - (Required - Forces new resource) - Indicates whether Fingerprint columns can be joined
     *   n any other Fingerprint column with a different name. This is a boolean field.
     * * `data_encryption_metadata.preserve_nulls` - (Required - Forces new resource) - Indicates whether NULL values are to be copied as NULL to encrypted tables (true)
     *   or cryptographically processed (false).
     * 
     */
    @Export(name="dataEncryptionMetadata", refs={CollaborationDataEncryptionMetadata.class}, tree="[0]")
    private Output</* @Nullable */ CollaborationDataEncryptionMetadata> dataEncryptionMetadata;

    /**
     * @return a collection of settings which determine how the [c3r client](https://docs.aws.amazon.com/clean-rooms/latest/userguide/crypto-computing.html) will encrypt data for use within this collaboration.
     * * `data_encryption_metadata.allow_clear_text` - (Required - Forces new resource) - Indicates whether encrypted tables can contain cleartext data. This is a boolea
     *   field.
     * * `data_encryption_metadata.allow_duplicates` - (Required - Forces new resource ) - Indicates whether Fingerprint columns can contain duplicate entries. This is a
     *   boolean field.
     * * `data_encryption_metadata.allow_joins_on_columns_with_different_names` - (Required - Forces new resource) - Indicates whether Fingerprint columns can be joined
     *   n any other Fingerprint column with a different name. This is a boolean field.
     * * `data_encryption_metadata.preserve_nulls` - (Required - Forces new resource) - Indicates whether NULL values are to be copied as NULL to encrypted tables (true)
     *   or cryptographically processed (false).
     * 
     */
    public Output<Optional<CollaborationDataEncryptionMetadata>> dataEncryptionMetadata() {
        return Codegen.optional(this.dataEncryptionMetadata);
    }
    /**
     * A description for a collaboration.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description for a collaboration.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Additional members of the collaboration which will be invited to join the collaboration.
     * * `member.account_id` - (Required - Forces new resource) - The account id for the invited member.
     * * `member.display_name` - (Required - Forces new resource) - The display name for the invited member.
     * * `member.member_abilities` - (Required - Forces new resource) - The list of abilities for the invited member. Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-creatorMemberAbilities).
     * 
     */
    @Export(name="members", refs={List.class,CollaborationMember.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CollaborationMember>> members;

    /**
     * @return Additional members of the collaboration which will be invited to join the collaboration.
     * * `member.account_id` - (Required - Forces new resource) - The account id for the invited member.
     * * `member.display_name` - (Required - Forces new resource) - The display name for the invited member.
     * * `member.member_abilities` - (Required - Forces new resource) - The list of abilities for the invited member. Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-creatorMemberAbilities).
     * 
     */
    public Output<Optional<List<CollaborationMember>>> members() {
        return Codegen.optional(this.members);
    }
    /**
     * The name of the collaboration.  Collaboration names do not need to be unique.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the collaboration.  Collaboration names do not need to be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Determines if members of the collaboration can enable query logs within their own.
     * emberships. Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-queryLogStatus).
     * 
     */
    @Export(name="queryLogStatus", refs={String.class}, tree="[0]")
    private Output<String> queryLogStatus;

    /**
     * @return Determines if members of the collaboration can enable query logs within their own.
     * emberships. Valid values [may be found here](https://docs.aws.amazon.com/clean-rooms/latest/apireference/API_CreateCollaboration.html#API-CreateCollaboration-request-queryLogStatus).
     * 
     */
    public Output<String> queryLogStatus() {
        return this.queryLogStatus;
    }
    /**
     * Key value pairs which tag the collaboration.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key value pairs which tag the collaboration.
     * 
     */
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
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Collaboration(String name) {
        this(name, CollaborationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Collaboration(String name, CollaborationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Collaboration(String name, CollaborationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cleanrooms/collaboration:Collaboration", name, args == null ? CollaborationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Collaboration(String name, Output<String> id, @Nullable CollaborationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cleanrooms/collaboration:Collaboration", name, state, makeResourceOptions(options, id));
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
    public static Collaboration get(String name, Output<String> id, @Nullable CollaborationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Collaboration(name, id, state, options);
    }
}
