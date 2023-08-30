# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ListenerCertificateArgs', 'ListenerCertificate']

@pulumi.input_type
class ListenerCertificateArgs:
    def __init__(__self__, *,
                 certificate_arn: pulumi.Input[str],
                 listener_arn: pulumi.Input[str]):
        """
        The set of arguments for constructing a ListenerCertificate resource.
        :param pulumi.Input[str] certificate_arn: The ARN of the certificate to attach to the listener.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the certificate.
        """
        pulumi.set(__self__, "certificate_arn", certificate_arn)
        pulumi.set(__self__, "listener_arn", listener_arn)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the certificate to attach to the listener.
        """
        return pulumi.get(self, "certificate_arn")

    @certificate_arn.setter
    def certificate_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_arn", value)

    @property
    @pulumi.getter(name="listenerArn")
    def listener_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the listener to which to attach the certificate.
        """
        return pulumi.get(self, "listener_arn")

    @listener_arn.setter
    def listener_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "listener_arn", value)


@pulumi.input_type
class _ListenerCertificateState:
    def __init__(__self__, *,
                 certificate_arn: Optional[pulumi.Input[str]] = None,
                 listener_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ListenerCertificate resources.
        :param pulumi.Input[str] certificate_arn: The ARN of the certificate to attach to the listener.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the certificate.
        """
        if certificate_arn is not None:
            pulumi.set(__self__, "certificate_arn", certificate_arn)
        if listener_arn is not None:
            pulumi.set(__self__, "listener_arn", listener_arn)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the certificate to attach to the listener.
        """
        return pulumi.get(self, "certificate_arn")

    @certificate_arn.setter
    def certificate_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_arn", value)

    @property
    @pulumi.getter(name="listenerArn")
    def listener_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the listener to which to attach the certificate.
        """
        return pulumi.get(self, "listener_arn")

    @listener_arn.setter
    def listener_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "listener_arn", value)


class ListenerCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_arn: Optional[pulumi.Input[str]] = None,
                 listener_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Load Balancer Listener Certificate resource.

        This resource is for additional certificates and does not replace the default certificate on the listener.

        > **Note:** `alb.ListenerCertificate` is known as `lb.ListenerCertificate`. The functionality is identical.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_certificate = aws.acm.Certificate("exampleCertificate")
        # ...
        front_end_load_balancer = aws.lb.LoadBalancer("frontEndLoadBalancer")
        # ...
        front_end_listener = aws.lb.Listener("frontEndListener")
        # ...
        example_listener_certificate = aws.lb.ListenerCertificate("exampleListenerCertificate",
            listener_arn=front_end_listener.arn,
            certificate_arn=example_certificate.arn)
        ```

        ## Import

        Using `pulumi import`, import Listener Certificates using the listener arn and certificate arn, separated by an underscore (`_`). For example:

        ```sh
         $ pulumi import aws:lb/listenerCertificate:ListenerCertificate example arn:aws:elasticloadbalancing:us-west-2:123456789012:listener/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b_arn:aws:iam::123456789012:server-certificate/tf-acc-test-6453083910015726063
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_arn: The ARN of the certificate to attach to the listener.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the certificate.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ListenerCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Load Balancer Listener Certificate resource.

        This resource is for additional certificates and does not replace the default certificate on the listener.

        > **Note:** `alb.ListenerCertificate` is known as `lb.ListenerCertificate`. The functionality is identical.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_certificate = aws.acm.Certificate("exampleCertificate")
        # ...
        front_end_load_balancer = aws.lb.LoadBalancer("frontEndLoadBalancer")
        # ...
        front_end_listener = aws.lb.Listener("frontEndListener")
        # ...
        example_listener_certificate = aws.lb.ListenerCertificate("exampleListenerCertificate",
            listener_arn=front_end_listener.arn,
            certificate_arn=example_certificate.arn)
        ```

        ## Import

        Using `pulumi import`, import Listener Certificates using the listener arn and certificate arn, separated by an underscore (`_`). For example:

        ```sh
         $ pulumi import aws:lb/listenerCertificate:ListenerCertificate example arn:aws:elasticloadbalancing:us-west-2:123456789012:listener/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b_arn:aws:iam::123456789012:server-certificate/tf-acc-test-6453083910015726063
        ```

        :param str resource_name: The name of the resource.
        :param ListenerCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ListenerCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_arn: Optional[pulumi.Input[str]] = None,
                 listener_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ListenerCertificateArgs.__new__(ListenerCertificateArgs)

            if certificate_arn is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_arn'")
            __props__.__dict__["certificate_arn"] = certificate_arn
            if listener_arn is None and not opts.urn:
                raise TypeError("Missing required property 'listener_arn'")
            __props__.__dict__["listener_arn"] = listener_arn
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="aws:elasticloadbalancingv2/listenerCertificate:ListenerCertificate")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(ListenerCertificate, __self__).__init__(
            'aws:lb/listenerCertificate:ListenerCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_arn: Optional[pulumi.Input[str]] = None,
            listener_arn: Optional[pulumi.Input[str]] = None) -> 'ListenerCertificate':
        """
        Get an existing ListenerCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_arn: The ARN of the certificate to attach to the listener.
        :param pulumi.Input[str] listener_arn: The ARN of the listener to which to attach the certificate.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ListenerCertificateState.__new__(_ListenerCertificateState)

        __props__.__dict__["certificate_arn"] = certificate_arn
        __props__.__dict__["listener_arn"] = listener_arn
        return ListenerCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateArn")
    def certificate_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the certificate to attach to the listener.
        """
        return pulumi.get(self, "certificate_arn")

    @property
    @pulumi.getter(name="listenerArn")
    def listener_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the listener to which to attach the certificate.
        """
        return pulumi.get(self, "listener_arn")

