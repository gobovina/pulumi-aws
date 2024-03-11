// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS Redshift Serverless Namespace.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.redshiftserverless.getNamespace({
 *     namespaceName: "example-namespace",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNamespace(args: GetNamespaceArgs, opts?: pulumi.InvokeOptions): Promise<GetNamespaceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:redshiftserverless/getNamespace:getNamespace", {
        "namespaceName": args.namespaceName,
    }, opts);
}

/**
 * A collection of arguments for invoking getNamespace.
 */
export interface GetNamespaceArgs {
    /**
     * The name of the namespace.
     */
    namespaceName: string;
}

/**
 * A collection of values returned by getNamespace.
 */
export interface GetNamespaceResult {
    /**
     * The username of the administrator for the first database created in the namespace.
     */
    readonly adminUsername: string;
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Namespace.
     */
    readonly arn: string;
    /**
     * The name of the first database created in the namespace.
     */
    readonly dbName: string;
    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace. When specifying `defaultIamRoleArn`, it also must be part of `iamRoles`.
     */
    readonly defaultIamRoleArn: string;
    /**
     * A list of IAM roles to associate with the namespace.
     */
    readonly iamRoles: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ARN of the Amazon Web Services Key Management Service key used to encrypt your data.
     */
    readonly kmsKeyId: string;
    /**
     * The types of logs the namespace can export. Available export types are `userlog`, `connectionlog`, and `useractivitylog`.
     */
    readonly logExports: string[];
    /**
     * The Redshift Namespace ID.
     */
    readonly namespaceId: string;
    readonly namespaceName: string;
}
/**
 * Data source for managing an AWS Redshift Serverless Namespace.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.redshiftserverless.getNamespace({
 *     namespaceName: "example-namespace",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getNamespaceOutput(args: GetNamespaceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNamespaceResult> {
    return pulumi.output(args).apply((a: any) => getNamespace(a, opts))
}

/**
 * A collection of arguments for invoking getNamespace.
 */
export interface GetNamespaceOutputArgs {
    /**
     * The name of the namespace.
     */
    namespaceName: pulumi.Input<string>;
}
