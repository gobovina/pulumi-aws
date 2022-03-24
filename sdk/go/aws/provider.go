// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the aws package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
	AccessKey pulumi.StringPtrOutput `pulumi:"accessKey"`
	// File containing custom root and intermediate certificates. Can also be configured using the `AWS_CA_BUNDLE` environment
	// variable. (Setting `ca_bundle` in the shared config file is not supported.)
	CustomCaBundle pulumi.StringPtrOutput `pulumi:"customCaBundle"`
	// Address of the EC2 metadata service endpoint to use. Can also be configured using the
	// `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
	Ec2MetadataServiceEndpoint pulumi.StringPtrOutput `pulumi:"ec2MetadataServiceEndpoint"`
	// Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the
	// `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
	Ec2MetadataServiceEndpointMode pulumi.StringPtrOutput `pulumi:"ec2MetadataServiceEndpointMode"`
	// The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
	// `HTTPS_PROXY` environment variables.
	HttpProxy pulumi.StringPtrOutput `pulumi:"httpProxy"`
	// The profile for API operations. If not set, the default profile created with `aws configure` will be used.
	Profile pulumi.StringPtrOutput `pulumi:"profile"`
	// The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
	SecretKey pulumi.StringPtrOutput `pulumi:"secretKey"`
	// The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
	//
	// Deprecated: Use shared_credentials_files instead.
	SharedCredentialsFile pulumi.StringPtrOutput `pulumi:"sharedCredentialsFile"`
	// The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
	StsRegion pulumi.StringPtrOutput `pulumi:"stsRegion"`
	// session token. A session token is only required if you are using temporary security credentials.
	Token pulumi.StringPtrOutput `pulumi:"token"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if isZero(args.Profile) {
		args.Profile = pulumi.StringPtr(getEnvOrDefault("", nil, "AWS_PROFILE").(string))
	}
	if isZero(args.Region) {
		args.Region = pulumi.StringPtr(getEnvOrDefault("", nil, "AWS_REGION", "AWS_DEFAULT_REGION").(string))
	}
	if isZero(args.SkipCredentialsValidation) {
		args.SkipCredentialsValidation = pulumi.BoolPtr(true)
	}
	if isZero(args.SkipGetEc2Platforms) {
		args.SkipGetEc2Platforms = pulumi.BoolPtr(true)
	}
	if isZero(args.SkipMetadataApiCheck) {
		args.SkipMetadataApiCheck = pulumi.BoolPtr(true)
	}
	if isZero(args.SkipRegionValidation) {
		args.SkipRegionValidation = pulumi.BoolPtr(true)
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:aws", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
	AccessKey         *string             `pulumi:"accessKey"`
	AllowedAccountIds []string            `pulumi:"allowedAccountIds"`
	AssumeRole        *ProviderAssumeRole `pulumi:"assumeRole"`
	// File containing custom root and intermediate certificates. Can also be configured using the `AWS_CA_BUNDLE` environment
	// variable. (Setting `ca_bundle` in the shared config file is not supported.)
	CustomCaBundle *string `pulumi:"customCaBundle"`
	// Configuration block with settings to default resource tags across all resources.
	DefaultTags *ProviderDefaultTags `pulumi:"defaultTags"`
	// Address of the EC2 metadata service endpoint to use. Can also be configured using the
	// `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
	Ec2MetadataServiceEndpoint *string `pulumi:"ec2MetadataServiceEndpoint"`
	// Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the
	// `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
	Ec2MetadataServiceEndpointMode *string            `pulumi:"ec2MetadataServiceEndpointMode"`
	Endpoints                      []ProviderEndpoint `pulumi:"endpoints"`
	ForbiddenAccountIds            []string           `pulumi:"forbiddenAccountIds"`
	// The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
	// `HTTPS_PROXY` environment variables.
	HttpProxy *string `pulumi:"httpProxy"`
	// Configuration block with settings to ignore resource tags across all resources.
	IgnoreTags *ProviderIgnoreTags `pulumi:"ignoreTags"`
	// Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`
	Insecure *bool `pulumi:"insecure"`
	// The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
	MaxRetries *int `pulumi:"maxRetries"`
	// The profile for API operations. If not set, the default profile created with `aws configure` will be used.
	Profile *string `pulumi:"profile"`
	// The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
	Region *string `pulumi:"region"`
	// Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By
	// default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY).
	// Specific to the Amazon S3 service.
	//
	// Deprecated: Use s3_use_path_style instead.
	S3ForcePathStyle *bool `pulumi:"s3ForcePathStyle"`
	// Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By
	// default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY).
	// Specific to the Amazon S3 service.
	S3UsePathStyle *bool `pulumi:"s3UsePathStyle"`
	// The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
	SecretKey *string `pulumi:"secretKey"`
	// List of paths to shared config files. If not set, defaults to [~/.aws/config].
	SharedConfigFiles []string `pulumi:"sharedConfigFiles"`
	// The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
	//
	// Deprecated: Use shared_credentials_files instead.
	SharedCredentialsFile *string `pulumi:"sharedCredentialsFile"`
	// List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials].
	SharedCredentialsFiles []string `pulumi:"sharedCredentialsFiles"`
	// Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
	// available/implemented.
	SkipCredentialsValidation *bool `pulumi:"skipCredentialsValidation"`
	// Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
	SkipGetEc2Platforms *bool `pulumi:"skipGetEc2Platforms"`
	// Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint.
	SkipMetadataApiCheck *bool `pulumi:"skipMetadataApiCheck"`
	// Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
	// not public (yet).
	SkipRegionValidation *bool `pulumi:"skipRegionValidation"`
	// Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
	SkipRequestingAccountId *bool `pulumi:"skipRequestingAccountId"`
	// The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
	StsRegion *string `pulumi:"stsRegion"`
	// session token. A session token is only required if you are using temporary security credentials.
	Token *string `pulumi:"token"`
	// Resolve an endpoint with DualStack capability
	UseDualstackEndpoint *bool `pulumi:"useDualstackEndpoint"`
	// Resolve an endpoint with FIPS capability
	UseFipsEndpoint *bool `pulumi:"useFipsEndpoint"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
	AccessKey         pulumi.StringPtrInput
	AllowedAccountIds pulumi.StringArrayInput
	AssumeRole        ProviderAssumeRolePtrInput
	// File containing custom root and intermediate certificates. Can also be configured using the `AWS_CA_BUNDLE` environment
	// variable. (Setting `ca_bundle` in the shared config file is not supported.)
	CustomCaBundle pulumi.StringPtrInput
	// Configuration block with settings to default resource tags across all resources.
	DefaultTags ProviderDefaultTagsPtrInput
	// Address of the EC2 metadata service endpoint to use. Can also be configured using the
	// `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
	Ec2MetadataServiceEndpoint pulumi.StringPtrInput
	// Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the
	// `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
	Ec2MetadataServiceEndpointMode pulumi.StringPtrInput
	Endpoints                      ProviderEndpointArrayInput
	ForbiddenAccountIds            pulumi.StringArrayInput
	// The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
	// `HTTPS_PROXY` environment variables.
	HttpProxy pulumi.StringPtrInput
	// Configuration block with settings to ignore resource tags across all resources.
	IgnoreTags ProviderIgnoreTagsPtrInput
	// Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`
	Insecure pulumi.BoolPtrInput
	// The maximum number of times an AWS API request is being executed. If the API request still fails, an error is thrown.
	MaxRetries pulumi.IntPtrInput
	// The profile for API operations. If not set, the default profile created with `aws configure` will be used.
	Profile pulumi.StringPtrInput
	// The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
	Region pulumi.StringPtrInput
	// Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By
	// default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY).
	// Specific to the Amazon S3 service.
	//
	// Deprecated: Use s3_use_path_style instead.
	S3ForcePathStyle pulumi.BoolPtrInput
	// Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By
	// default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY).
	// Specific to the Amazon S3 service.
	S3UsePathStyle pulumi.BoolPtrInput
	// The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
	SecretKey pulumi.StringPtrInput
	// List of paths to shared config files. If not set, defaults to [~/.aws/config].
	SharedConfigFiles pulumi.StringArrayInput
	// The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
	//
	// Deprecated: Use shared_credentials_files instead.
	SharedCredentialsFile pulumi.StringPtrInput
	// List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials].
	SharedCredentialsFiles pulumi.StringArrayInput
	// Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
	// available/implemented.
	SkipCredentialsValidation pulumi.BoolPtrInput
	// Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
	SkipGetEc2Platforms pulumi.BoolPtrInput
	// Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint.
	SkipMetadataApiCheck pulumi.BoolPtrInput
	// Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that are
	// not public (yet).
	SkipRegionValidation pulumi.BoolPtrInput
	// Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
	SkipRequestingAccountId pulumi.BoolPtrInput
	// The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
	StsRegion pulumi.StringPtrInput
	// session token. A session token is only required if you are using temporary security credentials.
	Token pulumi.StringPtrInput
	// Resolve an endpoint with DualStack capability
	UseDualstackEndpoint pulumi.BoolPtrInput
	// Resolve an endpoint with FIPS capability
	UseFipsEndpoint pulumi.BoolPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
