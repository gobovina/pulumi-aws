// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.workspaces.DirectoryArgs;
import com.pulumi.aws.workspaces.inputs.DirectoryState;
import com.pulumi.aws.workspaces.outputs.DirectorySelfServicePermissions;
import com.pulumi.aws.workspaces.outputs.DirectoryWorkspaceAccessProperties;
import com.pulumi.aws.workspaces.outputs.DirectoryWorkspaceCreationProperties;
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
 * Provides a WorkSpaces directory in AWS WorkSpaces Service.
 * 
 * &gt; **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.workspaces.Directory;
 * import com.pulumi.aws.workspaces.DirectoryArgs;
 * import com.pulumi.aws.workspaces.inputs.DirectorySelfServicePermissionsArgs;
 * import com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceAccessPropertiesArgs;
 * import com.pulumi.aws.workspaces.inputs.DirectoryWorkspaceCreationPropertiesArgs;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var workspaces = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;workspaces.amazonaws.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var workspacesDefault = new Role(&#34;workspacesDefault&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(workspaces.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var workspacesDefaultServiceAccess = new RolePolicyAttachment(&#34;workspacesDefaultServiceAccess&#34;, RolePolicyAttachmentArgs.builder()        
 *             .role(workspacesDefault.name())
 *             .policyArn(&#34;arn:aws:iam::aws:policy/AmazonWorkSpacesServiceAccess&#34;)
 *             .build());
 * 
 *         var workspacesDefaultSelfServiceAccess = new RolePolicyAttachment(&#34;workspacesDefaultSelfServiceAccess&#34;, RolePolicyAttachmentArgs.builder()        
 *             .role(workspacesDefault.name())
 *             .policyArn(&#34;arn:aws:iam::aws:policy/AmazonWorkSpacesSelfServiceAccess&#34;)
 *             .build());
 * 
 *         var exampleVpc = new Vpc(&#34;exampleVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleC = new Subnet(&#34;exampleC&#34;, SubnetArgs.builder()        
 *             .vpcId(exampleVpc.id())
 *             .availabilityZone(&#34;us-east-1c&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleD = new Subnet(&#34;exampleD&#34;, SubnetArgs.builder()        
 *             .vpcId(exampleVpc.id())
 *             .availabilityZone(&#34;us-east-1d&#34;)
 *             .cidrBlock(&#34;10.0.3.0/24&#34;)
 *             .build());
 * 
 *         var exampleDirectory = new Directory(&#34;exampleDirectory&#34;, DirectoryArgs.builder()        
 *             .directoryId(exampleDirectoryservice / directoryDirectory.id())
 *             .subnetIds(            
 *                 exampleC.id(),
 *                 exampleD.id())
 *             .tags(Map.of(&#34;Example&#34;, true))
 *             .selfServicePermissions(DirectorySelfServicePermissionsArgs.builder()
 *                 .changeComputeType(true)
 *                 .increaseVolumeSize(true)
 *                 .rebuildWorkspace(true)
 *                 .restartWorkspace(true)
 *                 .switchRunningMode(true)
 *                 .build())
 *             .workspaceAccessProperties(DirectoryWorkspaceAccessPropertiesArgs.builder()
 *                 .deviceTypeAndroid(&#34;ALLOW&#34;)
 *                 .deviceTypeChromeos(&#34;ALLOW&#34;)
 *                 .deviceTypeIos(&#34;ALLOW&#34;)
 *                 .deviceTypeLinux(&#34;DENY&#34;)
 *                 .deviceTypeOsx(&#34;ALLOW&#34;)
 *                 .deviceTypeWeb(&#34;DENY&#34;)
 *                 .deviceTypeWindows(&#34;DENY&#34;)
 *                 .deviceTypeZeroclient(&#34;DENY&#34;)
 *                 .build())
 *             .workspaceCreationProperties(DirectoryWorkspaceCreationPropertiesArgs.builder()
 *                 .customSecurityGroupId(aws_security_group.example().id())
 *                 .defaultOu(&#34;OU=AWS,DC=Workgroup,DC=Example,DC=com&#34;)
 *                 .enableInternetAccess(true)
 *                 .enableMaintenanceMode(true)
 *                 .userEnabledAsLocalAdministrator(true)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     workspacesDefaultServiceAccess,
 *                     workspacesDefaultSelfServiceAccess)
 *                 .build());
 * 
 *         var exampleA = new Subnet(&#34;exampleA&#34;, SubnetArgs.builder()        
 *             .vpcId(exampleVpc.id())
 *             .availabilityZone(&#34;us-east-1a&#34;)
 *             .cidrBlock(&#34;10.0.0.0/24&#34;)
 *             .build());
 * 
 *         var exampleB = new Subnet(&#34;exampleB&#34;, SubnetArgs.builder()        
 *             .vpcId(exampleVpc.id())
 *             .availabilityZone(&#34;us-east-1b&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var exampleDirectoryservice_directoryDirectory = new Directory(&#34;exampleDirectoryservice/directoryDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.example.com&#34;)
 *             .password(&#34;#S1ncerely&#34;)
 *             .size(&#34;Small&#34;)
 *             .vpcSettings(DirectoryVpcSettingsArgs.builder()
 *                 .vpcId(exampleVpc.id())
 *                 .subnetIds(                
 *                     exampleA.id(),
 *                     exampleB.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### IP Groups
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.workspaces.IpGroup;
 * import com.pulumi.aws.workspaces.Directory;
 * import com.pulumi.aws.workspaces.DirectoryArgs;
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
 *         var exampleIpGroup = new IpGroup(&#34;exampleIpGroup&#34;);
 * 
 *         var exampleDirectory = new Directory(&#34;exampleDirectory&#34;, DirectoryArgs.builder()        
 *             .directoryId(aws_directory_service_directory.example().id())
 *             .ipGroupIds(exampleIpGroup.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Workspaces directory using the directory ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:workspaces/directory:Directory main d-4444444444
 * ```
 * 
 */
@ResourceType(type="aws:workspaces/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    /**
     * The directory alias.
     * 
     */
    @Export(name="alias", refs={String.class}, tree="[0]")
    private Output<String> alias;

    /**
     * @return The directory alias.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * The user name for the service account.
     * 
     */
    @Export(name="customerUserName", refs={String.class}, tree="[0]")
    private Output<String> customerUserName;

    /**
     * @return The user name for the service account.
     * 
     */
    public Output<String> customerUserName() {
        return this.customerUserName;
    }
    /**
     * The directory identifier for registration in WorkSpaces service.
     * 
     */
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output<String> directoryId;

    /**
     * @return The directory identifier for registration in WorkSpaces service.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * The name of the directory.
     * 
     */
    @Export(name="directoryName", refs={String.class}, tree="[0]")
    private Output<String> directoryName;

    /**
     * @return The name of the directory.
     * 
     */
    public Output<String> directoryName() {
        return this.directoryName;
    }
    /**
     * The directory type.
     * 
     */
    @Export(name="directoryType", refs={String.class}, tree="[0]")
    private Output<String> directoryType;

    /**
     * @return The directory type.
     * 
     */
    public Output<String> directoryType() {
        return this.directoryType;
    }
    /**
     * The IP addresses of the DNS servers for the directory.
     * 
     */
    @Export(name="dnsIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dnsIpAddresses;

    /**
     * @return The IP addresses of the DNS servers for the directory.
     * 
     */
    public Output<List<String>> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    @Export(name="iamRoleId", refs={String.class}, tree="[0]")
    private Output<String> iamRoleId;

    /**
     * @return The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    public Output<String> iamRoleId() {
        return this.iamRoleId;
    }
    /**
     * The identifiers of the IP access control groups associated with the directory.
     * 
     */
    @Export(name="ipGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipGroupIds;

    /**
     * @return The identifiers of the IP access control groups associated with the directory.
     * 
     */
    public Output<List<String>> ipGroupIds() {
        return this.ipGroupIds;
    }
    /**
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    @Export(name="registrationCode", refs={String.class}, tree="[0]")
    private Output<String> registrationCode;

    /**
     * @return The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    public Output<String> registrationCode() {
        return this.registrationCode;
    }
    /**
     * Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    @Export(name="selfServicePermissions", refs={DirectorySelfServicePermissions.class}, tree="[0]")
    private Output<DirectorySelfServicePermissions> selfServicePermissions;

    /**
     * @return Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    public Output<DirectorySelfServicePermissions> selfServicePermissions() {
        return this.selfServicePermissions;
    }
    /**
     * The identifiers of the subnets where the directory resides.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return The identifiers of the subnets where the directory resides.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces directory. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    @Export(name="workspaceAccessProperties", refs={DirectoryWorkspaceAccessProperties.class}, tree="[0]")
    private Output<DirectoryWorkspaceAccessProperties> workspaceAccessProperties;

    /**
     * @return Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    public Output<DirectoryWorkspaceAccessProperties> workspaceAccessProperties() {
        return this.workspaceAccessProperties;
    }
    /**
     * Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    @Export(name="workspaceCreationProperties", refs={DirectoryWorkspaceCreationProperties.class}, tree="[0]")
    private Output<DirectoryWorkspaceCreationProperties> workspaceCreationProperties;

    /**
     * @return Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    public Output<DirectoryWorkspaceCreationProperties> workspaceCreationProperties() {
        return this.workspaceCreationProperties;
    }
    /**
     * The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    @Export(name="workspaceSecurityGroupId", refs={String.class}, tree="[0]")
    private Output<String> workspaceSecurityGroupId;

    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    public Output<String> workspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/directory:Directory", name, state, makeResourceOptions(options, id));
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
