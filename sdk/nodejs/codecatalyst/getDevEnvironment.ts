// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Data source for managing an AWS CodeCatalyst Dev Environment.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.codecatalyst.getDevEnvironment({
 *     spaceName: "myspace",
 *     projectName: "myproject",
 *     envId: exampleAwsCodecatalystDevEnvironment.id,
 * });
 * ```
 */
export function getDevEnvironment(args: GetDevEnvironmentArgs, opts?: pulumi.InvokeOptions): Promise<GetDevEnvironmentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:codecatalyst/getDevEnvironment:getDevEnvironment", {
        "alias": args.alias,
        "creatorId": args.creatorId,
        "envId": args.envId,
        "projectName": args.projectName,
        "repositories": args.repositories,
        "spaceName": args.spaceName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getDevEnvironment.
 */
export interface GetDevEnvironmentArgs {
    /**
     * The user-specified alias for the Dev Environment.
     */
    alias?: string;
    /**
     * The system-generated unique ID of the user who created the Dev Environment.
     */
    creatorId?: string;
    /**
     * - (Required) The system-generated unique ID of the Dev Environment for which you want to view information. To retrieve a list of Dev Environment IDs, use [ListDevEnvironments](https://docs.aws.amazon.com/codecatalyst/latest/APIReference/API_ListDevEnvironments.html).
     */
    envId: string;
    /**
     * The name of the project in the space.
     */
    projectName: string;
    /**
     * The source repository that contains the branch to clone into the Dev Environment.
     */
    repositories?: inputs.codecatalyst.GetDevEnvironmentRepository[];
    /**
     * The name of the space.
     */
    spaceName: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getDevEnvironment.
 */
export interface GetDevEnvironmentResult {
    /**
     * The user-specified alias for the Dev Environment.
     */
    readonly alias?: string;
    /**
     * The system-generated unique ID of the user who created the Dev Environment.
     */
    readonly creatorId?: string;
    readonly envId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Information about the integrated development environment (IDE) configured for a Dev Environment.
     */
    readonly ides: outputs.codecatalyst.GetDevEnvironmentIde[];
    /**
     * The amount of time the Dev Environment will run without any activity detected before stopping, in minutes. Only whole integers are allowed. Dev Environments consume compute minutes when running.
     */
    readonly inactivityTimeoutMinutes: number;
    /**
     * The Amazon EC2 instace type to use for the Dev Environment.
     */
    readonly instanceType: string;
    /**
     * The time when the Dev Environment was last updated, in coordinated universal time (UTC) timestamp format as specified in [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339#section-5.6).
     */
    readonly lastUpdatedTime: string;
    /**
     * Information about the amount of storage allocated to the Dev Environment.
     */
    readonly persistentStorages: outputs.codecatalyst.GetDevEnvironmentPersistentStorage[];
    readonly projectName: string;
    /**
     * The source repository that contains the branch to clone into the Dev Environment.
     */
    readonly repositories?: outputs.codecatalyst.GetDevEnvironmentRepository[];
    readonly spaceName: string;
    /**
     * The current status of the Dev Environment. From: PENDING | RUNNING | STARTING | STOPPING | STOPPED | FAILED | DELETING | DELETED.
     */
    readonly status: string;
    /**
     * The reason for the status.
     */
    readonly statusReason: string;
    readonly tags: {[key: string]: string};
}
/**
 * Data source for managing an AWS CodeCatalyst Dev Environment.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.codecatalyst.getDevEnvironment({
 *     spaceName: "myspace",
 *     projectName: "myproject",
 *     envId: exampleAwsCodecatalystDevEnvironment.id,
 * });
 * ```
 */
export function getDevEnvironmentOutput(args: GetDevEnvironmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDevEnvironmentResult> {
    return pulumi.output(args).apply((a: any) => getDevEnvironment(a, opts))
}

/**
 * A collection of arguments for invoking getDevEnvironment.
 */
export interface GetDevEnvironmentOutputArgs {
    /**
     * The user-specified alias for the Dev Environment.
     */
    alias?: pulumi.Input<string>;
    /**
     * The system-generated unique ID of the user who created the Dev Environment.
     */
    creatorId?: pulumi.Input<string>;
    /**
     * - (Required) The system-generated unique ID of the Dev Environment for which you want to view information. To retrieve a list of Dev Environment IDs, use [ListDevEnvironments](https://docs.aws.amazon.com/codecatalyst/latest/APIReference/API_ListDevEnvironments.html).
     */
    envId: pulumi.Input<string>;
    /**
     * The name of the project in the space.
     */
    projectName: pulumi.Input<string>;
    /**
     * The source repository that contains the branch to clone into the Dev Environment.
     */
    repositories?: pulumi.Input<pulumi.Input<inputs.codecatalyst.GetDevEnvironmentRepositoryArgs>[]>;
    /**
     * The name of the space.
     */
    spaceName: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
