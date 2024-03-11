// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Glue Data Catalog Encryption Settings resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.glue.DataCatalogEncryptionSettings("example", {dataCatalogEncryptionSettings: {
 *     connectionPasswordEncryption: {
 *         awsKmsKeyId: test.arn,
 *         returnConnectionPasswordEncrypted: true,
 *     },
 *     encryptionAtRest: {
 *         catalogEncryptionMode: "SSE-KMS",
 *         sseAwsKmsKeyId: test.arn,
 *     },
 * }});
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import Glue Data Catalog Encryption Settings using `CATALOG-ID` (AWS account ID if not custom). For example:
 *
 * ```sh
 * $ pulumi import aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings example 123456789012
 * ```
 */
export class DataCatalogEncryptionSettings extends pulumi.CustomResource {
    /**
     * Get an existing DataCatalogEncryptionSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataCatalogEncryptionSettingsState, opts?: pulumi.CustomResourceOptions): DataCatalogEncryptionSettings {
        return new DataCatalogEncryptionSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings';

    /**
     * Returns true if the given object is an instance of DataCatalogEncryptionSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataCatalogEncryptionSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataCatalogEncryptionSettings.__pulumiType;
    }

    /**
     * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     */
    public readonly catalogId!: pulumi.Output<string>;
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     */
    public readonly dataCatalogEncryptionSettings!: pulumi.Output<outputs.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings>;

    /**
     * Create a DataCatalogEncryptionSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataCatalogEncryptionSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataCatalogEncryptionSettingsArgs | DataCatalogEncryptionSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataCatalogEncryptionSettingsState | undefined;
            resourceInputs["catalogId"] = state ? state.catalogId : undefined;
            resourceInputs["dataCatalogEncryptionSettings"] = state ? state.dataCatalogEncryptionSettings : undefined;
        } else {
            const args = argsOrState as DataCatalogEncryptionSettingsArgs | undefined;
            if ((!args || args.dataCatalogEncryptionSettings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataCatalogEncryptionSettings'");
            }
            resourceInputs["catalogId"] = args ? args.catalogId : undefined;
            resourceInputs["dataCatalogEncryptionSettings"] = args ? args.dataCatalogEncryptionSettings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataCatalogEncryptionSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataCatalogEncryptionSettings resources.
 */
export interface DataCatalogEncryptionSettingsState {
    /**
     * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     */
    dataCatalogEncryptionSettings?: pulumi.Input<inputs.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings>;
}

/**
 * The set of arguments for constructing a DataCatalogEncryptionSettings resource.
 */
export interface DataCatalogEncryptionSettingsArgs {
    /**
     * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     */
    catalogId?: pulumi.Input<string>;
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     */
    dataCatalogEncryptionSettings: pulumi.Input<inputs.glue.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings>;
}
