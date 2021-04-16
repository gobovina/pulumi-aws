// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package lambda

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// See https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html
type Runtime pulumi.String

const (
	RuntimeDotnetCore2d1 = Runtime("dotnetcore2.1")
	RuntimeDotnetCore3d1 = Runtime("dotnetcore3.1")
	RuntimeGo1dx         = Runtime("go1.x")
	RuntimeJava8         = Runtime("java8")
	RuntimeJava8AL2      = Runtime("java8.al2")
	RuntimeJava11        = Runtime("java11")
	RuntimeRuby2d5       = Runtime("ruby2.5")
	RuntimeRuby2d7       = Runtime("ruby2.7")
	RuntimeNodeJS10dX    = Runtime("nodejs10.x")
	RuntimeNodeJS12dX    = Runtime("nodejs12.x")
	RuntimeNodeJS14dX    = Runtime("nodejs14.x")
	RuntimePython2d7     = Runtime("python2.7")
	RuntimePython3d6     = Runtime("python3.6")
	RuntimePython3d7     = Runtime("python3.7")
	RuntimePython3d8     = Runtime("python3.8")
	RuntimeCustom        = Runtime("provided")
	RuntimeCustomAL2     = Runtime("provided.al2")
)

func (Runtime) ElementType() reflect.Type {
	return reflect.TypeOf((*pulumi.String)(nil)).Elem()
}

func (e Runtime) ToStringOutput() pulumi.StringOutput {
	return pulumi.ToOutput(pulumi.String(e)).(pulumi.StringOutput)
}

func (e Runtime) ToStringOutputWithContext(ctx context.Context) pulumi.StringOutput {
	return pulumi.ToOutputWithContext(ctx, pulumi.String(e)).(pulumi.StringOutput)
}

func (e Runtime) ToStringPtrOutput() pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringPtrOutputWithContext(context.Background())
}

func (e Runtime) ToStringPtrOutputWithContext(ctx context.Context) pulumi.StringPtrOutput {
	return pulumi.String(e).ToStringOutputWithContext(ctx).ToStringPtrOutputWithContext(ctx)
}
