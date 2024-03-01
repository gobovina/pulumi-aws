// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package signer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a Signer Signing Job.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/signer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			testSp, err := signer.NewSigningProfile(ctx, "test_sp", &signer.SigningProfileArgs{
//				PlatformId: pulumi.String("AWSLambda-SHA384-ECDSA"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = signer.NewSigningJob(ctx, "build_signing_job", &signer.SigningJobArgs{
//				ProfileName: testSp.Name,
//				Source: &signer.SigningJobSourceArgs{
//					S3: &signer.SigningJobSourceS3Args{
//						Bucket:  pulumi.String("s3-bucket-name"),
//						Key:     pulumi.String("object-to-be-signed.zip"),
//						Version: pulumi.String("jADjFYYYEXAMPLETszPjOmCMFDzd9dN1"),
//					},
//				},
//				Destination: &signer.SigningJobDestinationArgs{
//					S3: &signer.SigningJobDestinationS3Args{
//						Bucket: pulumi.String("s3-bucket-name"),
//						Prefix: pulumi.String("signed/"),
//					},
//				},
//				IgnoreSigningJobFailure: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import Signer signing jobs using the `job_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:signer/signingJob:SigningJob test_signer_signing_job 9ed7e5c3-b8d4-4da0-8459-44e0b068f7ee
//
// ```
type SigningJob struct {
	pulumi.CustomResourceState

	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
	CompletedAt pulumi.StringOutput `pulumi:"completedAt"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The S3 bucket in which to save your signed object. See Destination below for details.
	Destination SigningJobDestinationOutput `pulumi:"destination"`
	// Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
	IgnoreSigningJobFailure pulumi.BoolPtrOutput `pulumi:"ignoreSigningJobFailure"`
	// The ID of the signing job on output.
	JobId pulumi.StringOutput `pulumi:"jobId"`
	// The IAM entity that initiated the signing job.
	JobInvoker pulumi.StringOutput `pulumi:"jobInvoker"`
	// The AWS account ID of the job owner.
	JobOwner pulumi.StringOutput `pulumi:"jobOwner"`
	// A human-readable name for the signing platform associated with the signing job.
	PlatformDisplayName pulumi.StringOutput `pulumi:"platformDisplayName"`
	// The platform to which your signed code image will be distributed.
	PlatformId pulumi.StringOutput `pulumi:"platformId"`
	// The name of the profile to initiate the signing operation.
	ProfileName pulumi.StringOutput `pulumi:"profileName"`
	// The version of the signing profile used to initiate the signing job.
	ProfileVersion pulumi.StringOutput `pulumi:"profileVersion"`
	// The IAM principal that requested the signing job.
	RequestedBy pulumi.StringOutput `pulumi:"requestedBy"`
	// A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
	RevocationRecords SigningJobRevocationRecordArrayOutput `pulumi:"revocationRecords"`
	// The time when the signature of a signing job expires.
	SignatureExpiresAt pulumi.StringOutput `pulumi:"signatureExpiresAt"`
	// Name of the S3 bucket where the signed code image is saved by code signing.
	SignedObjects SigningJobSignedObjectArrayOutput `pulumi:"signedObjects"`
	// The S3 bucket that contains the object to sign. See Source below for details.
	Source SigningJobSourceOutput `pulumi:"source"`
	// Status of the signing job.
	Status pulumi.StringOutput `pulumi:"status"`
	// String value that contains the status reason.
	StatusReason pulumi.StringOutput `pulumi:"statusReason"`
}

// NewSigningJob registers a new resource with the given unique name, arguments, and options.
func NewSigningJob(ctx *pulumi.Context,
	name string, args *SigningJobArgs, opts ...pulumi.ResourceOption) (*SigningJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Destination == nil {
		return nil, errors.New("invalid value for required argument 'Destination'")
	}
	if args.ProfileName == nil {
		return nil, errors.New("invalid value for required argument 'ProfileName'")
	}
	if args.Source == nil {
		return nil, errors.New("invalid value for required argument 'Source'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SigningJob
	err := ctx.RegisterResource("aws:signer/signingJob:SigningJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSigningJob gets an existing SigningJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSigningJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SigningJobState, opts ...pulumi.ResourceOption) (*SigningJob, error) {
	var resource SigningJob
	err := ctx.ReadResource("aws:signer/signingJob:SigningJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SigningJob resources.
type signingJobState struct {
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
	CompletedAt *string `pulumi:"completedAt"`
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The S3 bucket in which to save your signed object. See Destination below for details.
	Destination *SigningJobDestination `pulumi:"destination"`
	// Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
	IgnoreSigningJobFailure *bool `pulumi:"ignoreSigningJobFailure"`
	// The ID of the signing job on output.
	JobId *string `pulumi:"jobId"`
	// The IAM entity that initiated the signing job.
	JobInvoker *string `pulumi:"jobInvoker"`
	// The AWS account ID of the job owner.
	JobOwner *string `pulumi:"jobOwner"`
	// A human-readable name for the signing platform associated with the signing job.
	PlatformDisplayName *string `pulumi:"platformDisplayName"`
	// The platform to which your signed code image will be distributed.
	PlatformId *string `pulumi:"platformId"`
	// The name of the profile to initiate the signing operation.
	ProfileName *string `pulumi:"profileName"`
	// The version of the signing profile used to initiate the signing job.
	ProfileVersion *string `pulumi:"profileVersion"`
	// The IAM principal that requested the signing job.
	RequestedBy *string `pulumi:"requestedBy"`
	// A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
	RevocationRecords []SigningJobRevocationRecord `pulumi:"revocationRecords"`
	// The time when the signature of a signing job expires.
	SignatureExpiresAt *string `pulumi:"signatureExpiresAt"`
	// Name of the S3 bucket where the signed code image is saved by code signing.
	SignedObjects []SigningJobSignedObject `pulumi:"signedObjects"`
	// The S3 bucket that contains the object to sign. See Source below for details.
	Source *SigningJobSource `pulumi:"source"`
	// Status of the signing job.
	Status *string `pulumi:"status"`
	// String value that contains the status reason.
	StatusReason *string `pulumi:"statusReason"`
}

type SigningJobState struct {
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
	CompletedAt pulumi.StringPtrInput
	// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
	CreatedAt pulumi.StringPtrInput
	// The S3 bucket in which to save your signed object. See Destination below for details.
	Destination SigningJobDestinationPtrInput
	// Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
	IgnoreSigningJobFailure pulumi.BoolPtrInput
	// The ID of the signing job on output.
	JobId pulumi.StringPtrInput
	// The IAM entity that initiated the signing job.
	JobInvoker pulumi.StringPtrInput
	// The AWS account ID of the job owner.
	JobOwner pulumi.StringPtrInput
	// A human-readable name for the signing platform associated with the signing job.
	PlatformDisplayName pulumi.StringPtrInput
	// The platform to which your signed code image will be distributed.
	PlatformId pulumi.StringPtrInput
	// The name of the profile to initiate the signing operation.
	ProfileName pulumi.StringPtrInput
	// The version of the signing profile used to initiate the signing job.
	ProfileVersion pulumi.StringPtrInput
	// The IAM principal that requested the signing job.
	RequestedBy pulumi.StringPtrInput
	// A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
	RevocationRecords SigningJobRevocationRecordArrayInput
	// The time when the signature of a signing job expires.
	SignatureExpiresAt pulumi.StringPtrInput
	// Name of the S3 bucket where the signed code image is saved by code signing.
	SignedObjects SigningJobSignedObjectArrayInput
	// The S3 bucket that contains the object to sign. See Source below for details.
	Source SigningJobSourcePtrInput
	// Status of the signing job.
	Status pulumi.StringPtrInput
	// String value that contains the status reason.
	StatusReason pulumi.StringPtrInput
}

func (SigningJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*signingJobState)(nil)).Elem()
}

type signingJobArgs struct {
	// The S3 bucket in which to save your signed object. See Destination below for details.
	Destination SigningJobDestination `pulumi:"destination"`
	// Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
	IgnoreSigningJobFailure *bool `pulumi:"ignoreSigningJobFailure"`
	// The name of the profile to initiate the signing operation.
	ProfileName string `pulumi:"profileName"`
	// The S3 bucket that contains the object to sign. See Source below for details.
	Source SigningJobSource `pulumi:"source"`
}

// The set of arguments for constructing a SigningJob resource.
type SigningJobArgs struct {
	// The S3 bucket in which to save your signed object. See Destination below for details.
	Destination SigningJobDestinationInput
	// Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
	IgnoreSigningJobFailure pulumi.BoolPtrInput
	// The name of the profile to initiate the signing operation.
	ProfileName pulumi.StringInput
	// The S3 bucket that contains the object to sign. See Source below for details.
	Source SigningJobSourceInput
}

func (SigningJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*signingJobArgs)(nil)).Elem()
}

type SigningJobInput interface {
	pulumi.Input

	ToSigningJobOutput() SigningJobOutput
	ToSigningJobOutputWithContext(ctx context.Context) SigningJobOutput
}

func (*SigningJob) ElementType() reflect.Type {
	return reflect.TypeOf((**SigningJob)(nil)).Elem()
}

func (i *SigningJob) ToSigningJobOutput() SigningJobOutput {
	return i.ToSigningJobOutputWithContext(context.Background())
}

func (i *SigningJob) ToSigningJobOutputWithContext(ctx context.Context) SigningJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SigningJobOutput)
}

// SigningJobArrayInput is an input type that accepts SigningJobArray and SigningJobArrayOutput values.
// You can construct a concrete instance of `SigningJobArrayInput` via:
//
//	SigningJobArray{ SigningJobArgs{...} }
type SigningJobArrayInput interface {
	pulumi.Input

	ToSigningJobArrayOutput() SigningJobArrayOutput
	ToSigningJobArrayOutputWithContext(context.Context) SigningJobArrayOutput
}

type SigningJobArray []SigningJobInput

func (SigningJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SigningJob)(nil)).Elem()
}

func (i SigningJobArray) ToSigningJobArrayOutput() SigningJobArrayOutput {
	return i.ToSigningJobArrayOutputWithContext(context.Background())
}

func (i SigningJobArray) ToSigningJobArrayOutputWithContext(ctx context.Context) SigningJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SigningJobArrayOutput)
}

// SigningJobMapInput is an input type that accepts SigningJobMap and SigningJobMapOutput values.
// You can construct a concrete instance of `SigningJobMapInput` via:
//
//	SigningJobMap{ "key": SigningJobArgs{...} }
type SigningJobMapInput interface {
	pulumi.Input

	ToSigningJobMapOutput() SigningJobMapOutput
	ToSigningJobMapOutputWithContext(context.Context) SigningJobMapOutput
}

type SigningJobMap map[string]SigningJobInput

func (SigningJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SigningJob)(nil)).Elem()
}

func (i SigningJobMap) ToSigningJobMapOutput() SigningJobMapOutput {
	return i.ToSigningJobMapOutputWithContext(context.Background())
}

func (i SigningJobMap) ToSigningJobMapOutputWithContext(ctx context.Context) SigningJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SigningJobMapOutput)
}

type SigningJobOutput struct{ *pulumi.OutputState }

func (SigningJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SigningJob)(nil)).Elem()
}

func (o SigningJobOutput) ToSigningJobOutput() SigningJobOutput {
	return o
}

func (o SigningJobOutput) ToSigningJobOutputWithContext(ctx context.Context) SigningJobOutput {
	return o
}

// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was completed.
func (o SigningJobOutput) CompletedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.CompletedAt }).(pulumi.StringOutput)
}

// Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the signing job was created.
func (o SigningJobOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The S3 bucket in which to save your signed object. See Destination below for details.
func (o SigningJobOutput) Destination() SigningJobDestinationOutput {
	return o.ApplyT(func(v *SigningJob) SigningJobDestinationOutput { return v.Destination }).(SigningJobDestinationOutput)
}

// Set this argument to `true` to ignore signing job failures and retrieve failed status and reason. Default `false`.
func (o SigningJobOutput) IgnoreSigningJobFailure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.BoolPtrOutput { return v.IgnoreSigningJobFailure }).(pulumi.BoolPtrOutput)
}

// The ID of the signing job on output.
func (o SigningJobOutput) JobId() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.JobId }).(pulumi.StringOutput)
}

// The IAM entity that initiated the signing job.
func (o SigningJobOutput) JobInvoker() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.JobInvoker }).(pulumi.StringOutput)
}

// The AWS account ID of the job owner.
func (o SigningJobOutput) JobOwner() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.JobOwner }).(pulumi.StringOutput)
}

// A human-readable name for the signing platform associated with the signing job.
func (o SigningJobOutput) PlatformDisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.PlatformDisplayName }).(pulumi.StringOutput)
}

// The platform to which your signed code image will be distributed.
func (o SigningJobOutput) PlatformId() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.PlatformId }).(pulumi.StringOutput)
}

// The name of the profile to initiate the signing operation.
func (o SigningJobOutput) ProfileName() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.ProfileName }).(pulumi.StringOutput)
}

// The version of the signing profile used to initiate the signing job.
func (o SigningJobOutput) ProfileVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.ProfileVersion }).(pulumi.StringOutput)
}

// The IAM principal that requested the signing job.
func (o SigningJobOutput) RequestedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.RequestedBy }).(pulumi.StringOutput)
}

// A revocation record if the signature generated by the signing job has been revoked. Contains a timestamp and the ID of the IAM entity that revoked the signature.
func (o SigningJobOutput) RevocationRecords() SigningJobRevocationRecordArrayOutput {
	return o.ApplyT(func(v *SigningJob) SigningJobRevocationRecordArrayOutput { return v.RevocationRecords }).(SigningJobRevocationRecordArrayOutput)
}

// The time when the signature of a signing job expires.
func (o SigningJobOutput) SignatureExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.SignatureExpiresAt }).(pulumi.StringOutput)
}

// Name of the S3 bucket where the signed code image is saved by code signing.
func (o SigningJobOutput) SignedObjects() SigningJobSignedObjectArrayOutput {
	return o.ApplyT(func(v *SigningJob) SigningJobSignedObjectArrayOutput { return v.SignedObjects }).(SigningJobSignedObjectArrayOutput)
}

// The S3 bucket that contains the object to sign. See Source below for details.
func (o SigningJobOutput) Source() SigningJobSourceOutput {
	return o.ApplyT(func(v *SigningJob) SigningJobSourceOutput { return v.Source }).(SigningJobSourceOutput)
}

// Status of the signing job.
func (o SigningJobOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// String value that contains the status reason.
func (o SigningJobOutput) StatusReason() pulumi.StringOutput {
	return o.ApplyT(func(v *SigningJob) pulumi.StringOutput { return v.StatusReason }).(pulumi.StringOutput)
}

type SigningJobArrayOutput struct{ *pulumi.OutputState }

func (SigningJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SigningJob)(nil)).Elem()
}

func (o SigningJobArrayOutput) ToSigningJobArrayOutput() SigningJobArrayOutput {
	return o
}

func (o SigningJobArrayOutput) ToSigningJobArrayOutputWithContext(ctx context.Context) SigningJobArrayOutput {
	return o
}

func (o SigningJobArrayOutput) Index(i pulumi.IntInput) SigningJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SigningJob {
		return vs[0].([]*SigningJob)[vs[1].(int)]
	}).(SigningJobOutput)
}

type SigningJobMapOutput struct{ *pulumi.OutputState }

func (SigningJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SigningJob)(nil)).Elem()
}

func (o SigningJobMapOutput) ToSigningJobMapOutput() SigningJobMapOutput {
	return o
}

func (o SigningJobMapOutput) ToSigningJobMapOutputWithContext(ctx context.Context) SigningJobMapOutput {
	return o
}

func (o SigningJobMapOutput) MapIndex(k pulumi.StringInput) SigningJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SigningJob {
		return vs[0].(map[string]*SigningJob)[vs[1].(string)]
	}).(SigningJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SigningJobInput)(nil)).Elem(), &SigningJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*SigningJobArrayInput)(nil)).Elem(), SigningJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SigningJobMapInput)(nil)).Elem(), SigningJobMap{})
	pulumi.RegisterOutputType(SigningJobOutput{})
	pulumi.RegisterOutputType(SigningJobArrayOutput{})
	pulumi.RegisterOutputType(SigningJobMapOutput{})
}
