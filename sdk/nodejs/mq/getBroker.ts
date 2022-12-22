// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides information about a MQ Broker.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const brokerId = config.get("brokerId") || "";
 * const brokerName = config.get("brokerName") || "";
 * const byId = aws.mq.getBroker({
 *     brokerId: brokerId,
 * });
 * const byName = aws.mq.getBroker({
 *     brokerName: brokerName,
 * });
 * ```
 */
export function getBroker(args?: GetBrokerArgs, opts?: pulumi.InvokeOptions): Promise<GetBrokerResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:mq/getBroker:getBroker", {
        "brokerId": args.brokerId,
        "brokerName": args.brokerName,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getBroker.
 */
export interface GetBrokerArgs {
    /**
     * Unique id of the mq broker.
     */
    brokerId?: string;
    /**
     * Unique name of the mq broker.
     */
    brokerName?: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getBroker.
 */
export interface GetBrokerResult {
    readonly arn: string;
    readonly authenticationStrategy: string;
    readonly autoMinorVersionUpgrade: boolean;
    readonly brokerId: string;
    readonly brokerName: string;
    readonly configuration: outputs.mq.GetBrokerConfiguration;
    readonly deploymentMode: string;
    readonly encryptionOptions: outputs.mq.GetBrokerEncryptionOption[];
    readonly engineType: string;
    readonly engineVersion: string;
    readonly hostInstanceType: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instances: outputs.mq.GetBrokerInstance[];
    readonly ldapServerMetadatas: outputs.mq.GetBrokerLdapServerMetadata[];
    readonly logs: outputs.mq.GetBrokerLogs;
    readonly maintenanceWindowStartTime: outputs.mq.GetBrokerMaintenanceWindowStartTime;
    readonly publiclyAccessible: boolean;
    readonly securityGroups: string[];
    readonly storageType: string;
    readonly subnetIds: string[];
    readonly tags: {[key: string]: string};
    readonly users: outputs.mq.GetBrokerUser[];
}
/**
 * Provides information about a MQ Broker.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const config = new pulumi.Config();
 * const brokerId = config.get("brokerId") || "";
 * const brokerName = config.get("brokerName") || "";
 * const byId = aws.mq.getBroker({
 *     brokerId: brokerId,
 * });
 * const byName = aws.mq.getBroker({
 *     brokerName: brokerName,
 * });
 * ```
 */
export function getBrokerOutput(args?: GetBrokerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBrokerResult> {
    return pulumi.output(args).apply((a: any) => getBroker(a, opts))
}

/**
 * A collection of arguments for invoking getBroker.
 */
export interface GetBrokerOutputArgs {
    /**
     * Unique id of the mq broker.
     */
    brokerId?: pulumi.Input<string>;
    /**
     * Unique name of the mq broker.
     */
    brokerName?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
