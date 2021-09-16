// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package msk

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on an Amazon MSK Cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/msk"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := msk.LookupCluster(ctx, &msk.LookupClusterArgs{
// 			ClusterName: "example",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupCluster(ctx *pulumi.Context, args *LookupClusterArgs, opts ...pulumi.InvokeOption) (*LookupClusterResult, error) {
	var rv LookupClusterResult
	err := ctx.Invoke("aws:msk/getCluster:getCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCluster.
type LookupClusterArgs struct {
	// Name of the cluster.
	ClusterName string `pulumi:"clusterName"`
	// Map of key-value pairs assigned to the cluster.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getCluster.
type LookupClusterResult struct {
	// Amazon Resource Name (ARN) of the MSK cluster.
	Arn string `pulumi:"arn"`
	// Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
	BootstrapBrokers string `pulumi:"bootstrapBrokers"`
	// One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
	BootstrapBrokersSaslIam string `pulumi:"bootstrapBrokersSaslIam"`
	// One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
	BootstrapBrokersSaslScram string `pulumi:"bootstrapBrokersSaslScram"`
	// One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
	BootstrapBrokersTls string `pulumi:"bootstrapBrokersTls"`
	ClusterName         string `pulumi:"clusterName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Apache Kafka version.
	KafkaVersion string `pulumi:"kafkaVersion"`
	// Number of broker nodes in the cluster.
	NumberOfBrokerNodes int `pulumi:"numberOfBrokerNodes"`
	// Map of key-value pairs assigned to the cluster.
	Tags map[string]string `pulumi:"tags"`
	// A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
	ZookeeperConnectString string `pulumi:"zookeeperConnectString"`
}

func LookupClusterOutput(ctx *pulumi.Context, args LookupClusterOutputArgs, opts ...pulumi.InvokeOption) LookupClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClusterResult, error) {
			args := v.(LookupClusterArgs)
			r, err := LookupCluster(ctx, &args, opts...)
			return *r, err
		}).(LookupClusterResultOutput)
}

// A collection of arguments for invoking getCluster.
type LookupClusterOutputArgs struct {
	// Name of the cluster.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Map of key-value pairs assigned to the cluster.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterArgs)(nil)).Elem()
}

// A collection of values returned by getCluster.
type LookupClusterResultOutput struct{ *pulumi.OutputState }

func (LookupClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClusterResult)(nil)).Elem()
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutput() LookupClusterResultOutput {
	return o
}

func (o LookupClusterResultOutput) ToLookupClusterResultOutputWithContext(ctx context.Context) LookupClusterResultOutput {
	return o
}

// Amazon Resource Name (ARN) of the MSK cluster.
func (o LookupClusterResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
func (o LookupClusterResultOutput) BootstrapBrokers() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.BootstrapBrokers }).(pulumi.StringOutput)
}

// One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
func (o LookupClusterResultOutput) BootstrapBrokersSaslIam() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.BootstrapBrokersSaslIam }).(pulumi.StringOutput)
}

// One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
func (o LookupClusterResultOutput) BootstrapBrokersSaslScram() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.BootstrapBrokersSaslScram }).(pulumi.StringOutput)
}

// One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
func (o LookupClusterResultOutput) BootstrapBrokersTls() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.BootstrapBrokersTls }).(pulumi.StringOutput)
}

func (o LookupClusterResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// Apache Kafka version.
func (o LookupClusterResultOutput) KafkaVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.KafkaVersion }).(pulumi.StringOutput)
}

// Number of broker nodes in the cluster.
func (o LookupClusterResultOutput) NumberOfBrokerNodes() pulumi.IntOutput {
	return o.ApplyT(func(v LookupClusterResult) int { return v.NumberOfBrokerNodes }).(pulumi.IntOutput)
}

// Map of key-value pairs assigned to the cluster.
func (o LookupClusterResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClusterResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
func (o LookupClusterResultOutput) ZookeeperConnectString() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClusterResult) string { return v.ZookeeperConnectString }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClusterResultOutput{})
}
