// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides redshift cluster temporary credentials.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.redshift.getClusterCredentials({
 *     clusterIdentifier: aws_redshift_cluster.example.cluster_identifier,
 *     dbUser: aws_redshift_cluster.example.master_username,
 * });
 * ```
 */
export function getClusterCredentials(args: GetClusterCredentialsArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterCredentialsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:redshift/getClusterCredentials:getClusterCredentials", {
        "autoCreate": args.autoCreate,
        "clusterIdentifier": args.clusterIdentifier,
        "dbGroups": args.dbGroups,
        "dbName": args.dbName,
        "dbUser": args.dbUser,
        "durationSeconds": args.durationSeconds,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusterCredentials.
 */
export interface GetClusterCredentialsArgs {
    /**
     * Create a database user with the name specified for the user named in `dbUser` if one does not exist.
     */
    autoCreate?: boolean;
    /**
     * Unique identifier of the cluster that contains the database for which your are requesting credentials.
     */
    clusterIdentifier: string;
    /**
     * List of the names of existing database groups that the user named in `dbUser` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
     */
    dbGroups?: string[];
    /**
     * Name of a database that DbUser is authorized to log on to. If `dbName` is not specified, `dbUser` can log on to any existing database.
     */
    dbName?: string;
    /**
     * Name of a database user. If a user name matching `dbUser` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `dbUser` doesn't exist in the database and `autoCreate` is `True`, a new user is created using the value for `dbUser` with `PUBLIC` permissions.  If a database user matching the value for `dbUser` doesn't exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database.
     */
    dbUser: string;
    /**
     * The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
     */
    durationSeconds?: number;
}

/**
 * A collection of values returned by getClusterCredentials.
 */
export interface GetClusterCredentialsResult {
    readonly autoCreate?: boolean;
    readonly clusterIdentifier: string;
    readonly dbGroups?: string[];
    readonly dbName?: string;
    /**
     * Temporary password that authorizes the user name returned by `dbUser` to log on to the database `dbName`.
     */
    readonly dbPassword: string;
    readonly dbUser: string;
    readonly durationSeconds?: number;
    /**
     * Date and time the password in `dbPassword` expires.
     */
    readonly expiration: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * Provides redshift cluster temporary credentials.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.redshift.getClusterCredentials({
 *     clusterIdentifier: aws_redshift_cluster.example.cluster_identifier,
 *     dbUser: aws_redshift_cluster.example.master_username,
 * });
 * ```
 */
export function getClusterCredentialsOutput(args: GetClusterCredentialsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClusterCredentialsResult> {
    return pulumi.output(args).apply((a: any) => getClusterCredentials(a, opts))
}

/**
 * A collection of arguments for invoking getClusterCredentials.
 */
export interface GetClusterCredentialsOutputArgs {
    /**
     * Create a database user with the name specified for the user named in `dbUser` if one does not exist.
     */
    autoCreate?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the cluster that contains the database for which your are requesting credentials.
     */
    clusterIdentifier: pulumi.Input<string>;
    /**
     * List of the names of existing database groups that the user named in `dbUser` will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to `PUBLIC`.
     */
    dbGroups?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of a database that DbUser is authorized to log on to. If `dbName` is not specified, `dbUser` can log on to any existing database.
     */
    dbName?: pulumi.Input<string>;
    /**
     * Name of a database user. If a user name matching `dbUser` exists in the database, the temporary user credentials have the same permissions as the  existing user. If `dbUser` doesn't exist in the database and `autoCreate` is `True`, a new user is created using the value for `dbUser` with `PUBLIC` permissions.  If a database user matching the value for `dbUser` doesn't exist and `not` is `False`, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database.
     */
    dbUser: pulumi.Input<string>;
    /**
     * The number of seconds until the returned temporary password expires. Valid values are between `900` and `3600`. Default value is `900`.
     */
    durationSeconds?: pulumi.Input<number>;
}
