// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an Amazon MSK cluster.
 *
 * > **Note:** This resource manages _provisioned_ clusters. To manage a _serverless_ Amazon MSK cluster, use the `aws.msk.ServerlessCluster` resource.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const vpc = new aws.ec2.Vpc("vpc", {cidrBlock: "192.168.0.0/22"});
 * const azs = aws.getAvailabilityZones({
 *     state: "available",
 * });
 * const subnetAz1 = new aws.ec2.Subnet("subnetAz1", {
 *     availabilityZone: azs.then(azs => azs.names?.[0]),
 *     cidrBlock: "192.168.0.0/24",
 *     vpcId: vpc.id,
 * });
 * const subnetAz2 = new aws.ec2.Subnet("subnetAz2", {
 *     availabilityZone: azs.then(azs => azs.names?.[1]),
 *     cidrBlock: "192.168.1.0/24",
 *     vpcId: vpc.id,
 * });
 * const subnetAz3 = new aws.ec2.Subnet("subnetAz3", {
 *     availabilityZone: azs.then(azs => azs.names?.[2]),
 *     cidrBlock: "192.168.2.0/24",
 *     vpcId: vpc.id,
 * });
 * const sg = new aws.ec2.SecurityGroup("sg", {vpcId: vpc.id});
 * const kms = new aws.kms.Key("kms", {description: "example"});
 * const test = new aws.cloudwatch.LogGroup("test", {});
 * const bucket = new aws.s3.BucketV2("bucket", {});
 * const bucketAcl = new aws.s3.BucketAclV2("bucketAcl", {
 *     bucket: bucket.id,
 *     acl: "private",
 * });
 * const firehoseRole = new aws.iam.Role("firehoseRole", {assumeRolePolicy: `{
 * "Version": "2012-10-17",
 * "Statement": [
 *   {
 *     "Action": "sts:AssumeRole",
 *     "Principal": {
 *       "Service": "firehose.amazonaws.com"
 *     },
 *     "Effect": "Allow",
 *     "Sid": ""
 *   }
 *   ]
 * }
 * `});
 * const testStream = new aws.kinesis.FirehoseDeliveryStream("testStream", {
 *     destination: "s3",
 *     s3Configuration: {
 *         roleArn: firehoseRole.arn,
 *         bucketArn: bucket.arn,
 *     },
 *     tags: {
 *         LogDeliveryEnabled: "placeholder",
 *     },
 * });
 * const example = new aws.msk.Cluster("example", {
 *     kafkaVersion: "3.2.0",
 *     numberOfBrokerNodes: 3,
 *     brokerNodeGroupInfo: {
 *         instanceType: "kafka.m5.large",
 *         clientSubnets: [
 *             subnetAz1.id,
 *             subnetAz2.id,
 *             subnetAz3.id,
 *         ],
 *         storageInfo: {
 *             ebsStorageInfo: {
 *                 volumeSize: 1000,
 *             },
 *         },
 *         securityGroups: [sg.id],
 *     },
 *     encryptionInfo: {
 *         encryptionAtRestKmsKeyArn: kms.arn,
 *     },
 *     openMonitoring: {
 *         prometheus: {
 *             jmxExporter: {
 *                 enabledInBroker: true,
 *             },
 *             nodeExporter: {
 *                 enabledInBroker: true,
 *             },
 *         },
 *     },
 *     loggingInfo: {
 *         brokerLogs: {
 *             cloudwatchLogs: {
 *                 enabled: true,
 *                 logGroup: test.name,
 *             },
 *             firehose: {
 *                 enabled: true,
 *                 deliveryStream: testStream.name,
 *             },
 *             s3: {
 *                 enabled: true,
 *                 bucket: bucket.id,
 *                 prefix: "logs/msk-",
 *             },
 *         },
 *     },
 *     tags: {
 *         foo: "bar",
 *     },
 * });
 * export const zookeeperConnectString = example.zookeeperConnectString;
 * export const bootstrapBrokersTls = example.bootstrapBrokersTls;
 * ```
 * ### With volumeThroughput argument
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.msk.Cluster("example", {
 *     kafkaVersion: "2.7.1",
 *     numberOfBrokerNodes: 3,
 *     brokerNodeGroupInfo: {
 *         instanceType: "kafka.m5.4xlarge",
 *         clientSubnets: [
 *             aws_subnet.subnet_az1.id,
 *             aws_subnet.subnet_az2.id,
 *             aws_subnet.subnet_az3.id,
 *         ],
 *         storageInfo: {
 *             ebsStorageInfo: {
 *                 provisionedThroughput: {
 *                     enabled: true,
 *                     volumeThroughput: 250,
 *                 },
 *                 volumeSize: 1000,
 *             },
 *         },
 *         securityGroups: [aws_security_group.sg.id],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * MSK clusters can be imported using the cluster `arn`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:msk/cluster:Cluster example arn:aws:kafka:us-west-2:123456789012:cluster/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:msk/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokers!: pulumi.Output<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9198,b-2-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9198,b-3-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9198`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true` and `broker_node_group_info.0.connectivity_info.0.public_access.0.type` is set to `SERVICE_PROVIDED_EIPS` and the cluster fulfill all other requirements for public access. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokersPublicSaslIam!: pulumi.Output<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9196,b-2-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9196,b-3-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9196`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true` and `broker_node_group_info.0.connectivity_info.0.public_access.0.type` is set to `SERVICE_PROVIDED_EIPS` and the cluster fulfill all other requirements for public access. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokersPublicSaslScram!: pulumi.Output<string>;
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9194,b-2-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9194,b-3-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9194`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `broker_node_group_info.0.connectivity_info.0.public_access.0.type` is set to `SERVICE_PROVIDED_EIPS` and the cluster fulfill all other requirements for public access. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokersPublicTls!: pulumi.Output<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokersSaslIam!: pulumi.Output<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokersSaslScram!: pulumi.Output<string>;
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    public /*out*/ readonly bootstrapBrokersTls!: pulumi.Output<string>;
    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     */
    public readonly brokerNodeGroupInfo!: pulumi.Output<outputs.msk.ClusterBrokerNodeGroupInfo>;
    /**
     * Configuration block for specifying a client authentication. See below.
     */
    public readonly clientAuthentication!: pulumi.Output<outputs.msk.ClusterClientAuthentication | undefined>;
    /**
     * Name of the MSK cluster.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     */
    public readonly configurationInfo!: pulumi.Output<outputs.msk.ClusterConfigurationInfo | undefined>;
    /**
     * Current version of the MSK Cluster used for updates, e.g., `K13V1IB3VIYZZH`
     * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
     */
    public /*out*/ readonly currentVersion!: pulumi.Output<string>;
    /**
     * Configuration block for specifying encryption. See below.
     */
    public readonly encryptionInfo!: pulumi.Output<outputs.msk.ClusterEncryptionInfo | undefined>;
    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level. See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     */
    public readonly enhancedMonitoring!: pulumi.Output<string | undefined>;
    /**
     * Specify the desired Kafka software version.
     */
    public readonly kafkaVersion!: pulumi.Output<string>;
    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     */
    public readonly loggingInfo!: pulumi.Output<outputs.msk.ClusterLoggingInfo | undefined>;
    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     */
    public readonly numberOfBrokerNodes!: pulumi.Output<number>;
    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     */
    public readonly openMonitoring!: pulumi.Output<outputs.msk.ClusterOpenMonitoring | undefined>;
    /**
     * Controls storage mode for supported storage tiers. Valid values are: `LOCAL` or `TIERED`.
     */
    public readonly storageMode!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphabetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     */
    public /*out*/ readonly zookeeperConnectString!: pulumi.Output<string>;
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster via TLS. The returned values are sorted alphabetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     */
    public /*out*/ readonly zookeeperConnectStringTls!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["bootstrapBrokers"] = state ? state.bootstrapBrokers : undefined;
            resourceInputs["bootstrapBrokersPublicSaslIam"] = state ? state.bootstrapBrokersPublicSaslIam : undefined;
            resourceInputs["bootstrapBrokersPublicSaslScram"] = state ? state.bootstrapBrokersPublicSaslScram : undefined;
            resourceInputs["bootstrapBrokersPublicTls"] = state ? state.bootstrapBrokersPublicTls : undefined;
            resourceInputs["bootstrapBrokersSaslIam"] = state ? state.bootstrapBrokersSaslIam : undefined;
            resourceInputs["bootstrapBrokersSaslScram"] = state ? state.bootstrapBrokersSaslScram : undefined;
            resourceInputs["bootstrapBrokersTls"] = state ? state.bootstrapBrokersTls : undefined;
            resourceInputs["brokerNodeGroupInfo"] = state ? state.brokerNodeGroupInfo : undefined;
            resourceInputs["clientAuthentication"] = state ? state.clientAuthentication : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["configurationInfo"] = state ? state.configurationInfo : undefined;
            resourceInputs["currentVersion"] = state ? state.currentVersion : undefined;
            resourceInputs["encryptionInfo"] = state ? state.encryptionInfo : undefined;
            resourceInputs["enhancedMonitoring"] = state ? state.enhancedMonitoring : undefined;
            resourceInputs["kafkaVersion"] = state ? state.kafkaVersion : undefined;
            resourceInputs["loggingInfo"] = state ? state.loggingInfo : undefined;
            resourceInputs["numberOfBrokerNodes"] = state ? state.numberOfBrokerNodes : undefined;
            resourceInputs["openMonitoring"] = state ? state.openMonitoring : undefined;
            resourceInputs["storageMode"] = state ? state.storageMode : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["zookeeperConnectString"] = state ? state.zookeeperConnectString : undefined;
            resourceInputs["zookeeperConnectStringTls"] = state ? state.zookeeperConnectStringTls : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.brokerNodeGroupInfo === undefined) && !opts.urn) {
                throw new Error("Missing required property 'brokerNodeGroupInfo'");
            }
            if ((!args || args.kafkaVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kafkaVersion'");
            }
            if ((!args || args.numberOfBrokerNodes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'numberOfBrokerNodes'");
            }
            resourceInputs["brokerNodeGroupInfo"] = args ? args.brokerNodeGroupInfo : undefined;
            resourceInputs["clientAuthentication"] = args ? args.clientAuthentication : undefined;
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["configurationInfo"] = args ? args.configurationInfo : undefined;
            resourceInputs["encryptionInfo"] = args ? args.encryptionInfo : undefined;
            resourceInputs["enhancedMonitoring"] = args ? args.enhancedMonitoring : undefined;
            resourceInputs["kafkaVersion"] = args ? args.kafkaVersion : undefined;
            resourceInputs["loggingInfo"] = args ? args.loggingInfo : undefined;
            resourceInputs["numberOfBrokerNodes"] = args ? args.numberOfBrokerNodes : undefined;
            resourceInputs["openMonitoring"] = args ? args.openMonitoring : undefined;
            resourceInputs["storageMode"] = args ? args.storageMode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["bootstrapBrokers"] = undefined /*out*/;
            resourceInputs["bootstrapBrokersPublicSaslIam"] = undefined /*out*/;
            resourceInputs["bootstrapBrokersPublicSaslScram"] = undefined /*out*/;
            resourceInputs["bootstrapBrokersPublicTls"] = undefined /*out*/;
            resourceInputs["bootstrapBrokersSaslIam"] = undefined /*out*/;
            resourceInputs["bootstrapBrokersSaslScram"] = undefined /*out*/;
            resourceInputs["bootstrapBrokersTls"] = undefined /*out*/;
            resourceInputs["currentVersion"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["zookeeperConnectString"] = undefined /*out*/;
            resourceInputs["zookeeperConnectStringTls"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     */
    arn?: pulumi.Input<string>;
    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     */
    bootstrapBrokers?: pulumi.Input<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9198,b-2-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9198,b-3-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9198`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true` and `broker_node_group_info.0.connectivity_info.0.public_access.0.type` is set to `SERVICE_PROVIDED_EIPS` and the cluster fulfill all other requirements for public access. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    bootstrapBrokersPublicSaslIam?: pulumi.Input<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9196,b-2-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9196,b-3-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9196`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true` and `broker_node_group_info.0.connectivity_info.0.public_access.0.type` is set to `SERVICE_PROVIDED_EIPS` and the cluster fulfill all other requirements for public access. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    bootstrapBrokersPublicSaslScram?: pulumi.Input<string>;
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9194,b-2-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9194,b-3-public.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9194`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `broker_node_group_info.0.connectivity_info.0.public_access.0.type` is set to `SERVICE_PROVIDED_EIPS` and the cluster fulfill all other requirements for public access. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    bootstrapBrokersPublicTls?: pulumi.Input<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    bootstrapBrokersSaslIam?: pulumi.Input<string>;
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    bootstrapBrokersSaslScram?: pulumi.Input<string>;
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     */
    bootstrapBrokersTls?: pulumi.Input<string>;
    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     */
    brokerNodeGroupInfo?: pulumi.Input<inputs.msk.ClusterBrokerNodeGroupInfo>;
    /**
     * Configuration block for specifying a client authentication. See below.
     */
    clientAuthentication?: pulumi.Input<inputs.msk.ClusterClientAuthentication>;
    /**
     * Name of the MSK cluster.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     */
    configurationInfo?: pulumi.Input<inputs.msk.ClusterConfigurationInfo>;
    /**
     * Current version of the MSK Cluster used for updates, e.g., `K13V1IB3VIYZZH`
     * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
     */
    currentVersion?: pulumi.Input<string>;
    /**
     * Configuration block for specifying encryption. See below.
     */
    encryptionInfo?: pulumi.Input<inputs.msk.ClusterEncryptionInfo>;
    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level. See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     */
    enhancedMonitoring?: pulumi.Input<string>;
    /**
     * Specify the desired Kafka software version.
     */
    kafkaVersion?: pulumi.Input<string>;
    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     */
    loggingInfo?: pulumi.Input<inputs.msk.ClusterLoggingInfo>;
    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     */
    numberOfBrokerNodes?: pulumi.Input<number>;
    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     */
    openMonitoring?: pulumi.Input<inputs.msk.ClusterOpenMonitoring>;
    /**
     * Controls storage mode for supported storage tiers. Valid values are: `LOCAL` or `TIERED`.
     */
    storageMode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphabetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     */
    zookeeperConnectString?: pulumi.Input<string>;
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster via TLS. The returned values are sorted alphabetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     */
    zookeeperConnectStringTls?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     */
    brokerNodeGroupInfo: pulumi.Input<inputs.msk.ClusterBrokerNodeGroupInfo>;
    /**
     * Configuration block for specifying a client authentication. See below.
     */
    clientAuthentication?: pulumi.Input<inputs.msk.ClusterClientAuthentication>;
    /**
     * Name of the MSK cluster.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     */
    configurationInfo?: pulumi.Input<inputs.msk.ClusterConfigurationInfo>;
    /**
     * Configuration block for specifying encryption. See below.
     */
    encryptionInfo?: pulumi.Input<inputs.msk.ClusterEncryptionInfo>;
    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level. See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     */
    enhancedMonitoring?: pulumi.Input<string>;
    /**
     * Specify the desired Kafka software version.
     */
    kafkaVersion: pulumi.Input<string>;
    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     */
    loggingInfo?: pulumi.Input<inputs.msk.ClusterLoggingInfo>;
    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     */
    numberOfBrokerNodes: pulumi.Input<number>;
    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     */
    openMonitoring?: pulumi.Input<inputs.msk.ClusterOpenMonitoring>;
    /**
     * Controls storage mode for supported storage tiers. Valid values are: `LOCAL` or `TIERED`.
     */
    storageMode?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
