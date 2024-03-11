# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AuthPolicyArgs', 'AuthPolicy']

@pulumi.input_type
class AuthPolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 resource_identifier: pulumi.Input[str],
                 state: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AuthPolicy resource.
        :param pulumi.Input[str] policy: The auth policy. The policy string in JSON must not contain newlines or blank lines.
        :param pulumi.Input[str] resource_identifier: The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        :param pulumi.Input[str] state: The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "resource_identifier", resource_identifier)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The auth policy. The policy string in JSON must not contain newlines or blank lines.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="resourceIdentifier")
    def resource_identifier(self) -> pulumi.Input[str]:
        """
        The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        """
        return pulumi.get(self, "resource_identifier")

    @resource_identifier.setter
    def resource_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_identifier", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


@pulumi.input_type
class _AuthPolicyState:
    def __init__(__self__, *,
                 policy: Optional[pulumi.Input[str]] = None,
                 resource_identifier: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthPolicy resources.
        :param pulumi.Input[str] policy: The auth policy. The policy string in JSON must not contain newlines or blank lines.
        :param pulumi.Input[str] resource_identifier: The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        :param pulumi.Input[str] state: The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if resource_identifier is not None:
            pulumi.set(__self__, "resource_identifier", resource_identifier)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The auth policy. The policy string in JSON must not contain newlines or blank lines.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="resourceIdentifier")
    def resource_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        """
        return pulumi.get(self, "resource_identifier")

    @resource_identifier.setter
    def resource_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_identifier", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class AuthPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 resource_identifier: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS VPC Lattice Auth Policy.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.vpclattice.Service("example",
            name="example-vpclattice-service",
            auth_type="AWS_IAM",
            custom_domain_name="example.com")
        example_auth_policy = aws.vpclattice.AuthPolicy("example",
            resource_identifier=example.arn,
            policy=json.dumps({
                "version": "2012-10-17",
                "statement": [{
                    "action": "*",
                    "effect": "Allow",
                    "principal": "*",
                    "resource": "*",
                    "condition": {
                        "stringNotEqualsIgnoreCase": {
                            "aws:PrincipalType": "anonymous",
                        },
                    },
                }],
            }))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import VPC Lattice Auth Policy using the `id`. For example:

        ```sh
        $ pulumi import aws:vpclattice/authPolicy:AuthPolicy example abcd-12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The auth policy. The policy string in JSON must not contain newlines or blank lines.
        :param pulumi.Input[str] resource_identifier: The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        :param pulumi.Input[str] state: The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS VPC Lattice Auth Policy.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.vpclattice.Service("example",
            name="example-vpclattice-service",
            auth_type="AWS_IAM",
            custom_domain_name="example.com")
        example_auth_policy = aws.vpclattice.AuthPolicy("example",
            resource_identifier=example.arn,
            policy=json.dumps({
                "version": "2012-10-17",
                "statement": [{
                    "action": "*",
                    "effect": "Allow",
                    "principal": "*",
                    "resource": "*",
                    "condition": {
                        "stringNotEqualsIgnoreCase": {
                            "aws:PrincipalType": "anonymous",
                        },
                    },
                }],
            }))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import VPC Lattice Auth Policy using the `id`. For example:

        ```sh
        $ pulumi import aws:vpclattice/authPolicy:AuthPolicy example abcd-12345678
        ```

        :param str resource_name: The name of the resource.
        :param AuthPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 resource_identifier: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthPolicyArgs.__new__(AuthPolicyArgs)

            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if resource_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'resource_identifier'")
            __props__.__dict__["resource_identifier"] = resource_identifier
            __props__.__dict__["state"] = state
        super(AuthPolicy, __self__).__init__(
            'aws:vpclattice/authPolicy:AuthPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy: Optional[pulumi.Input[str]] = None,
            resource_identifier: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'AuthPolicy':
        """
        Get an existing AuthPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The auth policy. The policy string in JSON must not contain newlines or blank lines.
        :param pulumi.Input[str] resource_identifier: The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        :param pulumi.Input[str] state: The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthPolicyState.__new__(_AuthPolicyState)

        __props__.__dict__["policy"] = policy
        __props__.__dict__["resource_identifier"] = resource_identifier
        __props__.__dict__["state"] = state
        return AuthPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The auth policy. The policy string in JSON must not contain newlines or blank lines.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="resourceIdentifier")
    def resource_identifier(self) -> pulumi.Output[str]:
        """
        The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
        """
        return pulumi.get(self, "resource_identifier")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[Optional[str]]:
        """
        The state of the auth policy. The auth policy is only active when the auth type is set to `AWS_IAM`. If you provide a policy, then authentication and authorization decisions are made based on this policy and the client's IAM policy. If the Auth type is `NONE`, then, any auth policy you provide will remain inactive.
        """
        return pulumi.get(self, "state")

