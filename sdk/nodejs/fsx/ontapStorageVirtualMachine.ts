// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages a FSx Storage Virtual Machine.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) for more information.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.fsx.OntapStorageVirtualMachine("test", {fileSystemId: aws_fsx_ontap_file_system.test.id});
 * ```
 * ### Using a Self-Managed Microsoft Active Directory
 *
 * Additional information for using AWS Directory Service with ONTAP File Systems can be found in the [FSx ONTAP Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/self-managed-AD.html).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.fsx.OntapStorageVirtualMachine("test", {
 *     fileSystemId: aws_fsx_ontap_file_system.test.id,
 *     activeDirectoryConfiguration: {
 *         netbiosName: "mysvm",
 *         selfManagedActiveDirectoryConfiguration: {
 *             dnsIps: [
 *                 "10.0.0.111",
 *                 "10.0.0.222",
 *             ],
 *             domainName: "corp.example.com",
 *             password: "avoid-plaintext-passwords",
 *             username: "Admin",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import FSx Storage Virtual Machine using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:fsx/ontapStorageVirtualMachine:OntapStorageVirtualMachine example svm-12345678abcdef123
 * ```
 *  Certain resource arguments, like `svm_admin_password` and the `self_managed_active_directory` configuation block `password`, do not have a FSx API method for reading the information after creation. If these arguments are set in the Pulumi program on an imported resource, Pulumi will always show a difference. To workaround this behavior, either omit the argument from the Pulumi program or use `ignore_changes` to hide the difference. For example:
 */
export class OntapStorageVirtualMachine extends pulumi.CustomResource {
    /**
     * Get an existing OntapStorageVirtualMachine resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OntapStorageVirtualMachineState, opts?: pulumi.CustomResourceOptions): OntapStorageVirtualMachine {
        return new OntapStorageVirtualMachine(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:fsx/ontapStorageVirtualMachine:OntapStorageVirtualMachine';

    /**
     * Returns true if the given object is an instance of OntapStorageVirtualMachine.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OntapStorageVirtualMachine {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OntapStorageVirtualMachine.__pulumiType;
    }

    /**
     * Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     */
    public readonly activeDirectoryConfiguration!: pulumi.Output<outputs.fsx.OntapStorageVirtualMachineActiveDirectoryConfiguration | undefined>;
    /**
     * Amazon Resource Name of the storage virtual machine.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The endpoints that are used to access data or to manage the storage virtual machine using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     */
    public /*out*/ readonly endpoints!: pulumi.Output<outputs.fsx.OntapStorageVirtualMachineEndpoint[]>;
    /**
     * The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     */
    public readonly fileSystemId!: pulumi.Output<string>;
    /**
     * The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     */
    public readonly rootVolumeSecurityStyle!: pulumi.Output<string | undefined>;
    /**
     * Describes the SVM's subtype, e.g. `DEFAULT`
     */
    public /*out*/ readonly subtype!: pulumi.Output<string>;
    public readonly svmAdminPassword!: pulumi.Output<string | undefined>;
    /**
     * A map of tags to assign to the storage virtual machine. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The SVM's UUID (universally unique identifier).
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a OntapStorageVirtualMachine resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OntapStorageVirtualMachineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OntapStorageVirtualMachineArgs | OntapStorageVirtualMachineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OntapStorageVirtualMachineState | undefined;
            resourceInputs["activeDirectoryConfiguration"] = state ? state.activeDirectoryConfiguration : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["endpoints"] = state ? state.endpoints : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["rootVolumeSecurityStyle"] = state ? state.rootVolumeSecurityStyle : undefined;
            resourceInputs["subtype"] = state ? state.subtype : undefined;
            resourceInputs["svmAdminPassword"] = state ? state.svmAdminPassword : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as OntapStorageVirtualMachineArgs | undefined;
            if ((!args || args.fileSystemId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fileSystemId'");
            }
            resourceInputs["activeDirectoryConfiguration"] = args ? args.activeDirectoryConfiguration : undefined;
            resourceInputs["fileSystemId"] = args ? args.fileSystemId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["rootVolumeSecurityStyle"] = args ? args.rootVolumeSecurityStyle : undefined;
            resourceInputs["svmAdminPassword"] = args?.svmAdminPassword ? pulumi.secret(args.svmAdminPassword) : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["endpoints"] = undefined /*out*/;
            resourceInputs["subtype"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["svmAdminPassword"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(OntapStorageVirtualMachine.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OntapStorageVirtualMachine resources.
 */
export interface OntapStorageVirtualMachineState {
    /**
     * Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     */
    activeDirectoryConfiguration?: pulumi.Input<inputs.fsx.OntapStorageVirtualMachineActiveDirectoryConfiguration>;
    /**
     * Amazon Resource Name of the storage virtual machine.
     */
    arn?: pulumi.Input<string>;
    /**
     * The endpoints that are used to access data or to manage the storage virtual machine using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     */
    endpoints?: pulumi.Input<pulumi.Input<inputs.fsx.OntapStorageVirtualMachineEndpoint>[]>;
    /**
     * The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     */
    rootVolumeSecurityStyle?: pulumi.Input<string>;
    /**
     * Describes the SVM's subtype, e.g. `DEFAULT`
     */
    subtype?: pulumi.Input<string>;
    svmAdminPassword?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the storage virtual machine. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The SVM's UUID (universally unique identifier).
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OntapStorageVirtualMachine resource.
 */
export interface OntapStorageVirtualMachineArgs {
    /**
     * Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     */
    activeDirectoryConfiguration?: pulumi.Input<inputs.fsx.OntapStorageVirtualMachineActiveDirectoryConfiguration>;
    /**
     * The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     */
    rootVolumeSecurityStyle?: pulumi.Input<string>;
    svmAdminPassword?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the storage virtual machine. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
